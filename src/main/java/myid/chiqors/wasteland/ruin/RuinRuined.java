

package myid.chiqors.wasteland.ruin;

import cpw.mods.fml.common.IWorldGenerator;
import myid.chiqors.wasteland.config.ModConfig;
import myid.chiqors.wasteland.items.LootStack;
import myid.chiqors.wasteland.utils.CustomItemStack;
import myid.chiqors.wasteland.utils.Rectangle;
import myid.chiqors.wasteland.utils.Vector;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;

public class RuinRuined extends Ruin implements IWorldGenerator {
  private RuinGenHelper genHelper = new RuinGenHelper();
  
  public RuinRuined(String par1Name) {
    super(par1Name);
  }
  
  public boolean generate(World world, Random rand, int x, int y, int z) {
    RuinGenHelper.setWorld(world);
    Rectangle pos = new Rectangle(new Vector(x - 5, y, z - 6), 10, 12);
    int[] lay = Layout.getLevels(world, pos);
    Block surfaceBlock = ModConfig.getSurfaceBlock();
    if (Layout.checkLevel(lay, 3)) {
      int xCoord = x;
      int yCoord = Layout.getMinLevel(lay);
      int zCoord = z;
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 6, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 5, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 7, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 4, Blocks.netherrack);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 1, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 6, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 0, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, surfaceBlock);
      RuinGenHelper.setBlock(xCoord - 6, yCoord, zCoord - 6, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 7, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.stone_stairs);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 6, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 4, (Block)Blocks.fire);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 2, Blocks.stone_stairs);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.stone_stairs);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, xCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.log);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, xCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord + 5, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 0, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 1, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 3, Blocks.stonebrick, 2);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 2, yCoord, zCoord + 5, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 2, (Block)Blocks.chest);
      TileEntityChest chest = (TileEntityChest)world.getTileEntity(xCoord - 4, yCoord, zCoord - 2);
      LootStack loot = setItems(rand);
      CustomItemStack.placeLoot(rand, chest, CustomItemStack.getLootItems(rand, loot.items, loot.minNum, loot.maxNum, loot.repeat));
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord + 4, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord + 0, Blocks.stonebrick);
      yCoord++;
      RuinGenHelper.setBlock(xCoord - 3, yCoord, zCoord - 4, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 1, Blocks.stonebrick);
      yCoord++;
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick, 2);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick, 2);
      yCoord++;
      RuinGenHelper.setBlock(xCoord - 4, yCoord, zCoord - 3, Blocks.stonebrick);
      RuinGenHelper.setBlock(xCoord - 5, yCoord, zCoord - 2, Blocks.stonebrick);
      return true;
    } 
    return false;
  }
}
