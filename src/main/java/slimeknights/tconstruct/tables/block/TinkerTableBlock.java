package slimeknights.tconstruct.tables.block;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import slimeknights.tconstruct.shared.block.TableBlock;

import net.minecraft.block.AbstractBlock.Properties;

public abstract class TinkerTableBlock extends TableBlock implements ITinkerStationBlock {

  public TinkerTableBlock(Properties builder) {
    super(builder);
  }

  @Override
  public boolean openGui(PlayerEntity player, World world, BlockPos pos) {
    return super.openGui(player, world, pos);
  }
}
