package net.devops.delacallealcraft.item;

import net.devops.delacallealcraft.DeLaCalleAlCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DeLaCalleAlCraft.MOD_ID);

    public static final RegistryObject<Item> HARINA = ITEMS.register("harina",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TORTILLA = ITEMS.register("tortilla",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TACO_DE_SAL = ITEMS.register("taco_de_sal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAL = ITEMS.register("sal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TACOS_AL_PASTOR = ITEMS.register("tacos_al_pastor",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ACHIOTE = ITEMS.register("achiote",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARNE_CONDIMENTADA = ITEMS.register("carne_condimentada",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ASADOR_TROMPO = ITEMS.register("asador_trompo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TROMPO_CRUDO = ITEMS.register("trompo_crudo",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARNE_CONDIMENTADA_CRUDA = ITEMS.register("carne_condimentada_cruda",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}

