

package myid.chiqors.wasteland.world;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.WorldTypeEvent;

public class WorldChunkManagerWasteland extends WorldChunkManager {
  
  private GenLayer genBiomes;
  
  private GenLayer biomeIndexLayer;
  
  private BiomeCache biomeCache;
  
  private static final String __OBFID = "CL_00000166";
  
  protected WorldChunkManagerWasteland() {
    this.biomeCache = new BiomeCache(this);
  }
  
  public WorldChunkManagerWasteland(long p_i1975_1_, WorldType p_i1975_3_) {
    this();
    GenLayer[] agenlayer = WastelandGenLayerBiome.initializeAllBiomeGenerators(p_i1975_1_, p_i1975_3_);
    agenlayer = getModdedBiomeGenerators(p_i1975_3_, p_i1975_1_, agenlayer);
    this.genBiomes = agenlayer[0];
    this.biomeIndexLayer = agenlayer[1];
  }
  
  public WorldChunkManagerWasteland(World p_i1976_1_) {
    this(p_i1976_1_.getSeed(), p_i1976_1_.getWorldInfo().getTerrainType());
  }
  
  public List getBiomesToSpawnIn() {
    return allowedBiomes;
  }
  
  public BiomeGenBase getBiomeGenAt(int p_76935_1_, int p_76935_2_) {
    return this.biomeCache.getBiomeGenAt(p_76935_1_, p_76935_2_);
  }
  
  public float[] getRainfall(float[] p_76936_1_, int p_76936_2_, int p_76936_3_, int p_76936_4_, int p_76936_5_) {
    IntCache.resetIntCache();
    if (p_76936_1_ == null || p_76936_1_.length < p_76936_4_ * p_76936_5_)
      p_76936_1_ = new float[p_76936_4_ * p_76936_5_]; 
    int[] aint = this.biomeIndexLayer.getInts(p_76936_2_, p_76936_3_, p_76936_4_, p_76936_5_);
    for (int i1 = 0; i1 < p_76936_4_ * p_76936_5_; i1++) {
      try {
        float f = BiomeGenBase.getBiome(aint[i1]).getIntRainfall() / 65536.0F;
        if (f > 1.0F)
          f = 1.0F; 
        p_76936_1_[i1] = f;
      } catch (Throwable throwable) {
        CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Biome id");
        CrashReportCategory crashreportcategory = crashreport.makeCategory("DownfallBlock");
        crashreportcategory.addCrashSection("biome id", Integer.valueOf(i1));
        crashreportcategory.addCrashSection("downfalls[] size", Integer.valueOf(p_76936_1_.length));
        crashreportcategory.addCrashSection("x", Integer.valueOf(p_76936_2_));
        crashreportcategory.addCrashSection("z", Integer.valueOf(p_76936_3_));
        crashreportcategory.addCrashSection("w", Integer.valueOf(p_76936_4_));
        crashreportcategory.addCrashSection("h", Integer.valueOf(p_76936_5_));
        throw new ReportedException(crashreport);
      } 
    } 
    return p_76936_1_;
  }
  
  @SideOnly(Side.CLIENT)
  public float getTemperatureAtHeight(float p_76939_1_, int p_76939_2_) {
    return p_76939_1_;
  }
  
  public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] p_76937_1_, int p_76937_2_, int p_76937_3_, int p_76937_4_, int p_76937_5_) {
    IntCache.resetIntCache();
    if (p_76937_1_ == null || p_76937_1_.length < p_76937_4_ * p_76937_5_)
      p_76937_1_ = new BiomeGenBase[p_76937_4_ * p_76937_5_]; 
    int[] aint = this.genBiomes.getInts(p_76937_2_, p_76937_3_, p_76937_4_, p_76937_5_);
    try {
      for (int i1 = 0; i1 < p_76937_4_ * p_76937_5_; i1++)
        p_76937_1_[i1] = BiomeGenBase.getBiome(aint[i1]); 
      return p_76937_1_;
    } catch (Throwable throwable) {
      CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Biome id");
      CrashReportCategory crashreportcategory = crashreport.makeCategory("RawBiomeBlock");
      crashreportcategory.addCrashSection("biomes[] size", Integer.valueOf(p_76937_1_.length));
      crashreportcategory.addCrashSection("x", Integer.valueOf(p_76937_2_));
      crashreportcategory.addCrashSection("z", Integer.valueOf(p_76937_3_));
      crashreportcategory.addCrashSection("w", Integer.valueOf(p_76937_4_));
      crashreportcategory.addCrashSection("h", Integer.valueOf(p_76937_5_));
      throw new ReportedException(crashreport);
    } 
  }
  
  public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] p_76933_1_, int p_76933_2_, int p_76933_3_, int p_76933_4_, int p_76933_5_) {
    return getBiomeGenAt(p_76933_1_, p_76933_2_, p_76933_3_, p_76933_4_, p_76933_5_, true);
  }
  
  public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] p_76931_1_, int p_76931_2_, int p_76931_3_, int p_76931_4_, int p_76931_5_, boolean p_76931_6_) {
    IntCache.resetIntCache();
    if (p_76931_1_ == null || p_76931_1_.length < p_76931_4_ * p_76931_5_)
      p_76931_1_ = new BiomeGenBase[p_76931_4_ * p_76931_5_]; 
    if (p_76931_6_ && p_76931_4_ == 16 && p_76931_5_ == 16 && (p_76931_2_ & 0xF) == 0 && (p_76931_3_ & 0xF) == 0) {
      BiomeGenBase[] abiomegenbase1 = this.biomeCache.getCachedBiomes(p_76931_2_, p_76931_3_);
      System.arraycopy(abiomegenbase1, 0, p_76931_1_, 0, p_76931_4_ * p_76931_5_);
      return p_76931_1_;
    } 
    int[] aint = this.biomeIndexLayer.getInts(p_76931_2_, p_76931_3_, p_76931_4_, p_76931_5_);
    for (int i1 = 0; i1 < p_76931_4_ * p_76931_5_; i1++)
      p_76931_1_[i1] = BiomeGenBase.getBiome(aint[i1]); 
    return p_76931_1_;
  }
  
  public boolean areBiomesViable(int p_76940_1_, int p_76940_2_, int p_76940_3_, List p_76940_4_) {
    IntCache.resetIntCache();
    int l = p_76940_1_ - p_76940_3_ >> 2;
    int i1 = p_76940_2_ - p_76940_3_ >> 2;
    int j1 = p_76940_1_ + p_76940_3_ >> 2;
    int k1 = p_76940_2_ + p_76940_3_ >> 2;
    int l1 = j1 - l + 1;
    int i2 = k1 - i1 + 1;
    int[] aint = this.genBiomes.getInts(l, i1, l1, i2);
    try {
      for (int j2 = 0; j2 < l1 * i2; j2++) {
        BiomeGenBase biomegenbase = BiomeGenBase.getBiome(aint[j2]);
        if (!p_76940_4_.contains(biomegenbase))
          return false; 
      } 
      return true;
    } catch (Throwable throwable) {
      CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Biome id");
      CrashReportCategory crashreportcategory = crashreport.makeCategory("Layer");
      crashreportcategory.addCrashSection("Layer", this.genBiomes.toString());
      crashreportcategory.addCrashSection("x", Integer.valueOf(p_76940_1_));
      crashreportcategory.addCrashSection("z", Integer.valueOf(p_76940_2_));
      crashreportcategory.addCrashSection("radius", Integer.valueOf(p_76940_3_));
      crashreportcategory.addCrashSection("allowed", p_76940_4_);
      throw new ReportedException(crashreport);
    } 
  }
  
  public ChunkPosition findBiomePosition(int p_150795_1_, int p_150795_2_, int p_150795_3_, List p_150795_4_, Random p_150795_5_) {
    IntCache.resetIntCache();
    int l = p_150795_1_ - p_150795_3_ >> 2;
    int i1 = p_150795_2_ - p_150795_3_ >> 2;
    int j1 = p_150795_1_ + p_150795_3_ >> 2;
    int k1 = p_150795_2_ + p_150795_3_ >> 2;
    int l1 = j1 - l + 1;
    int i2 = k1 - i1 + 1;
    int[] aint = this.genBiomes.getInts(l, i1, l1, i2);
    ChunkPosition chunkposition = null;
    int j2 = 0;
    for (int k2 = 0; k2 < l1 * i2; k2++) {
      int l2 = l + k2 % l1 << 2;
      int i3 = i1 + k2 / l1 << 2;
      BiomeGenBase biomegenbase = BiomeGenBase.getBiome(aint[k2]);
      if (p_150795_4_.contains(biomegenbase) && (chunkposition == null || p_150795_5_.nextInt(j2 + 1) == 0)) {
        chunkposition = new ChunkPosition(l2, 0, i3);
        j2++;
      } 
    } 
    return chunkposition;
  }
  
  public void cleanupCache() {
    this.biomeCache.cleanupCache();
  }
  
  public GenLayer[] getModdedBiomeGenerators(WorldType worldType, long seed, GenLayer[] original) {
    WorldTypeEvent.InitBiomeGens event = new WorldTypeEvent.InitBiomeGens(worldType, seed, original);
    MinecraftForge.TERRAIN_GEN_BUS.post((Event)event);
    return event.newBiomeGens;
  }
}
