package net.devops.delacallealcraft.datagen;

import net.devops.delacallealcraft.DeLaCalleAlCraft;
import net.devops.delacallealcraft.block.ModBlocks;
import net.devops.delacallealcraft.block.custom.AchioteBushBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DeLaCalleAlCraft.MOD_ID ,exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem1(ModBlocks.SALT_BLOCK);

        makeBush(((SweetBerryBushBlock) ModBlocks.ACHIOTE_BUSH.get()), "achiote_bush_state", "achiote_bush_state");
    }

    public void makeBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(AchioteBushBlock.AGE),
                ResourceLocation.fromNamespaceAndPath(DeLaCalleAlCraft.MOD_ID, "block/" + textureName + state.getValue(AchioteBushBlock.AGE))).renderType("cutout"));

        return models;
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
