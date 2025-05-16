package net.devops.delacallealcraft.datagen;

import net.devops.delacallealcraft.DeLaCalleAlCraft;
import net.devops.delacallealcraft.block.ModBlocks;
import net.devops.delacallealcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DeLaCalleAlCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.HARINA.get());
        basicItem(ModItems.TORTILLA.get());
        basicItem(ModItems.TACO_DE_SAL.get());
        basicItem(ModItems.SAL.get());
        basicItem(ModItems.TACO_AL_PASTOR.get());
        basicItem(ModItems.ACHIOTE.get());
        basicItem(ModItems.CARNE_CONDIMENTADA.get());
        basicItem(ModItems.CARNE_CONDIMENTADA_CRUDA.get());
        basicItem(ModItems.TROMPO_CRUDO.get());
        basicItem(ModItems.TORTA_TROMPO.get());
    }
}
