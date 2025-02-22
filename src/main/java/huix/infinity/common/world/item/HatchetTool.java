package huix.infinity.common.world.item;

import huix.infinity.common.world.item.tier.IFWTier;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;

public class HatchetTool extends AxeTool {
    public HatchetTool(IFWTier tier, Properties properties) {
        super(tier, 1, properties);
    }

    public HatchetTool(IFWTier tier, float durability, Properties properties) {
        super(tier, durability, properties);
    }

    @Override
    public float getReachBonus() {
        return 0.5F;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        return InteractionResult.PASS;
    }

    @Override
    public float getDecayRateForBreakingBlock(BlockState state) {
        return super.getDecayRateForBreakingBlock(state) * 1.333F;
    }

    @Override
    public float getBaseHarvestEfficiency(BlockState state) {
        return super.getBaseHarvestEfficiency(state) * 0.5F;
    }
}
