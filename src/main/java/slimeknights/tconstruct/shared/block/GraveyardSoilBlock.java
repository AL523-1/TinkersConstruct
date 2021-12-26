package slimeknights.tconstruct.shared.block;

import net.minecraft.block.Block;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraft.block.AbstractBlock.Properties;

public class GraveyardSoilBlock extends Block {

  public GraveyardSoilBlock(Properties properties) {
    super(properties);
  }

  @Override
  public void stepOn(World worldIn, BlockPos pos, Entity entityIn) {
    this.processGraveyardSoil(entityIn);
  }

  // heal undead entities
  private void processGraveyardSoil(Entity entity) {
    if (entity instanceof MobEntity) {
      LivingEntity entityLiving = (LivingEntity) entity;
      if (entityLiving.getMobType() == CreatureAttribute.UNDEAD) {
        entityLiving.heal(1);
      }
    }
  }
}
