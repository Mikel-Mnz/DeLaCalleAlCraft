package net.devops.delacallealcraft.worldgen;

import net.devops.delacallealcraft.DeLaCalleAlCraft;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_ACHIOTE_BUSH = registerKey("add_achiote_bush");
    public static final ResourceKey<BiomeModifier> ADD_SALT_BLOCK = registerKey("add_salt_block");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_ACHIOTE_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SAVANNA), biomes.getOrThrow(Biomes.SAVANNA_PLATEAU)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.ACHIOTE_BUSH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_SALT_BLOCK, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DESERT), biomes.getOrThrow(Biomes.BADLANDS)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.SALT_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(DeLaCalleAlCraft.MOD_ID, name));
    }
}
