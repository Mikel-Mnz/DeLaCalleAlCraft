package net.devops.delacallealcraft.item;

import net.devops.delacallealcraft.DeLaCalleAlCraft;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeLaCalleAlCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DE_LA_CALLE_AL_CRAFT_ITEMS = CREATIVE_MOD_TABS.register("de_la_calle_al_craft_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.HARINA.get()))
                    .title(Component.translatable("creativetab.delacallealcraft.harina_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.HARINA.get());
                        output.accept(ModItems.TORTILLA.get());
                        output.accept(ModItems.SAL.get());
                        output.accept(ModItems.TACO_DE_SAL.get());
                    })
                    .build()

    );


    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
