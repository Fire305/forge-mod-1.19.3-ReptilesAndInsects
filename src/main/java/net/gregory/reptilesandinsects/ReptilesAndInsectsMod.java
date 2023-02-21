package net.gregory.reptilesandinsects;

import com.mojang.logging.LogUtils;
import net.gregory.reptilesandinsects.item.ModCreativeModeTab;
import net.gregory.reptilesandinsects.item.ModItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ReptilesAndInsectsMod.MODID)
public class ReptilesAndInsectsMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "reptilesandinsects";
    private static final Logger LOGGER = LogUtils.getLogger();


    public ReptilesAndInsectsMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItem.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab()== CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItem.WOODEN_NET);
        }

        if(event.getTab()== ModCreativeModeTab.ReptailAndInsect_TAB){
            event.accept(ModItem.WOODEN_NET);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
