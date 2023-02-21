package net.gregory.reptilesandinsects.item;

import net.gregory.reptilesandinsects.ReptilesAndInsectsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ReptilesAndInsectsMod.MODID);

        public static final RegistryObject<Item> WOODEN_NET = ITEMS.register("wooden_net",
                () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
