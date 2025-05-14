package net.devops.delacallealcraft.datagen;

import net.devops.delacallealcraft.DeLaCalleAlCraft;
import net.devops.delacallealcraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DeLaCalleAlCraft.MOD_ID ,exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem1(ModBlocks.SALT_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockWithItem1(RegistryObject<Block> blockRegistryObject) {
        String name = blockRegistryObject.getId().getPath();

        // Modelo del bloque
        simpleBlock(blockRegistryObject.get(),
                models().withExistingParent(name, modLoc("block/" + name))
        );

        // Modelo del item
        itemModels().getBuilder(name)
                .parent(models().getExistingFile(modLoc("block/" + name)));
    }
}
