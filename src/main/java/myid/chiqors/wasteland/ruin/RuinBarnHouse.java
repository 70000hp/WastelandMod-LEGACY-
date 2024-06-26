

package myid.chiqors.wasteland.ruin;

import cpw.mods.fml.common.IWorldGenerator;
import myid.chiqors.wasteland.items.LootStack;
import myid.chiqors.wasteland.utils.CustomItemStack;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;

public class RuinBarnHouse extends Ruin implements IWorldGenerator {
  private RuinGenHelper genHelper = new RuinGenHelper();
  
  public RuinBarnHouse(String name) {
    super(name);
  }
  
  public boolean generate(World world, Random random, int x, int y, int z) {
    RuinGenHelper.setWorld(world);
    int xCoord = x;
    int yCoord = y;
    int zCoord = z;
    Material material1 = world.getBlock(xCoord, yCoord, zCoord).getMaterial();
    int[] basePos = { x, y, z };
    if (material1.isSolid() && world.getHeightValue(xCoord + 1, zCoord + 1) == yCoord && world.getHeightValue(xCoord, zCoord + 1) == yCoord && world.getHeightValue(xCoord - 1, zCoord + 1) == yCoord && world.getHeightValue(xCoord - 1, zCoord) == yCoord && world.getHeightValue(xCoord - 1, zCoord - 1) == yCoord && world.getHeightValue(xCoord, zCoord - 1) == yCoord && world.getHeightValue(xCoord + 1, zCoord - 1) == yCoord) {
      RuinGenHelper.setWorld(world);
      xCoord -= 6;
      zCoord -= 4;
      RuinGenHelper.setCube(xCoord, yCoord + 1, zCoord - 1, 11, 9, 14, Blocks.air);
      yCoord--;
      int i;
      for (i = 0; i < 9; i++)
        world.setBlock(xCoord, yCoord, zCoord + i, Blocks.cobblestone); 
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 4, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 6, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 7, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 4, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 2, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 4, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 5, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 7, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 4, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 6, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 7, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 4, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 5, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 6, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 2, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 4, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 5, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 7, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 2, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 4, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 5, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 2, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 4, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 5, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 6, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 7, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 4, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 6, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 7, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 4, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 6, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 7, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 1, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 2, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 3, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 4, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 5, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 6, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 7, Blocks.dirt);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 8, Blocks.cobblestone);
      for (i = 0; i < 9; i++)
        RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord, Blocks.cobblestone); 
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 3, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 4, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 3, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 6, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 3, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 6, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 1, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 2, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 3, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 6, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 8, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 0, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 3, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 6, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 0, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 6, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 0, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 3, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 6, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 0, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 3, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 6, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 0, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 3, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 4, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 6, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 0, Blocks.fence);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 3, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 6, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 0, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 1, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 2, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 4, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 5, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 7, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 8, Blocks.air);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 4, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 8, Blocks.log);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 4, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 3, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 4, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 5, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 8, Blocks.log);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 6, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 3, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 4, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 6, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 8, Blocks.log);
      yCoord++;
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.oak_stairs, 5);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 1, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 2, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 5, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 6, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 7, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 6, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.oak_stairs, 4);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 7, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 7, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 0, Blocks.oak_stairs, 5);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 10, yCoord, zCoord + 5, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 5, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 11, yCoord, zCoord + 6, Blocks.planks);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 4, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 6, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 7, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 8, Blocks.log);
      yCoord++;
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord - 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord - 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord - 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 7, (Block)Blocks.chest);
      TileEntityChest chest = (TileEntityChest)world.getTileEntity(xCoord + 1, yCoord, zCoord + 7);
      LootStack loot = setItems(random);
      CustomItemStack.placeLoot(random, chest, CustomItemStack.getLootItems(random, loot.items, loot.minNum, loot.maxNum, loot.repeat));
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord - 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord - 1, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 0, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 8, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 9, yCoord, zCoord + 9, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 4, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 5, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 6, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 7, Blocks.log);
      yCoord++;
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 7, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 3, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 6, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 7, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 8, yCoord, zCoord + 8, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 5, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 6, Blocks.cobblestone);
      yCoord++;
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 1, Blocks.log);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 1, yCoord, zCoord + 0, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 2, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 4, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 5, yCoord, zCoord + 7, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 5, Blocks.cobblestone);
      yCoord++;
      RuinGenHelper.setBlock(xCoord - 1, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 0, yCoord, zCoord + 2, Blocks.cobblestone);
      RuinGenHelper.setBlock(xCoord + 12, yCoord, zCoord + 5, Blocks.cobblestone);
      return true;
    } 
    return false;
  }
  
  private ItemStack getChestLoot(Random rand, ItemStack[] items) {
    int i = rand.nextInt(items.length);
    ItemStack item = new ItemStack(items[i].getItem(), 1);
    if (item.getItem() == Items.wheat)
      return new ItemStack(item.getItem(), rand.nextInt(8) + 4); 
    if (item.getItem() == Items.apple)
      return new ItemStack(item.getItem(), rand.nextInt(2) + 1); 
    if (item.getItem() == Items.bread)
      return new ItemStack(item.getItem(), rand.nextInt(2) + 2); 
    return new ItemStack(item.getItem(), 1);
  }
}
