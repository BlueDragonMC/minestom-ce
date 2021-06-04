package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockAlternative;

/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(
        since = "forever",
        forRemoval = false
)
public final class SmoothRedSandstoneSlab {
    /**
     * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
     */
    @Deprecated(
            since = "forever",
            forRemoval = false
    )
    public static void initStates() {
        Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10799, "type=top", "waterlogged=true"));
        Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10800, "type=top", "waterlogged=false"));
        Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10801, "type=bottom", "waterlogged=true"));
        Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10802, "type=bottom", "waterlogged=false"));
        Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10803, "type=double", "waterlogged=true"));
        Block.SMOOTH_RED_SANDSTONE_SLAB.addBlockAlternative(new BlockAlternative((short) 10804, "type=double", "waterlogged=false"));
    }
}
