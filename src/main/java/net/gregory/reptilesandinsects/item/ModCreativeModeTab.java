package net.gregory.reptilesandinsects.item;

import net.gregory.reptilesandinsects.ReptilesAndInsectsMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ReptilesAndInsectsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab ReptailAndInsect_TAB;

     @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
         ReptailAndInsect_TAB = event.registerCreativeModeTab(new ResourceLocation(ReptilesAndInsectsMod.MODID, "reptileandinsect_tab"),
                builder -> builder.icon(()-> new ItemStack(ModItem.WOODEN_NET.get()))
                        .title(Component.translatable("creativemodetab.reptileandinsect_tab")));
    }
}
