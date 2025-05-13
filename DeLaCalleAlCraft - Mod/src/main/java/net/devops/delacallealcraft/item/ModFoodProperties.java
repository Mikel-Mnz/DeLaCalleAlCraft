package net.devops.delacallealcraft.item;

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
    }