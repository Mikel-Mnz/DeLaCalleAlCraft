package net.devops.delacallealcraft.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TACO_DE_SAL = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .build();
    
    public static final FoodProperties TACO_AL_PASTOR = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.25f)
            .build();

    public static final FoodProperties ACHIOTE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.15f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 140), 0.20f)
            .fast()
            .build();

    public static final FoodProperties TORTA_PASTOR = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(0.15f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 140), 0.20f)
            .fast()
            .build();

    }