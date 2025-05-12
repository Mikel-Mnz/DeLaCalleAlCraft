package net.devops.delacallealcraft.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;

public class SaltBlock extends Block {

    public SaltBlock(BlockBehaviour.Properties properties) {
        super(properties.noOcclusion()); // Esto ya permite transparencias
    }

    // Invisible para selección (opcional, si quieres que el jugador no lo seleccione)
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.box(0.4D, 0.0D, 0.4D, 0.6D, 0.6D, 0.6D);
    }

    // Invisible para colisiones (permite pasar a través)
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.box(0.4D, 0.0D, 0.4D, 0.6D, 0.6D, 0.6D);
    }
}
