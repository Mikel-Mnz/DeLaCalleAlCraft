package net.devops.delacallealcraft.datagen;

import net.devops.delacallealcraft.DeLaCalleAlCraft;
import net.devops.delacallealcraft.item.ModItems;
import net.devops.delacallealcraft.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, DeLaCalleAlCraft.MOD_ID, registries);
    }

    @Override
    protected void start(HolderLookup.Provider registries) {
        this.add("delacallealcraft_salt_from_skeleton",
                new AddItemModifier(new LootItemCondition[] {
                        LootItemRandomChanceCondition.randomChance(0.25f).build()
                }, ModItems.SAL.get()));



    }
}
