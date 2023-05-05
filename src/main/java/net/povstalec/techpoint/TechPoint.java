package net.povstalec.techpoint;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.povstalec.techpoint.common.init.BlockInit;
import net.povstalec.techpoint.common.init.EffectInit;
import net.povstalec.techpoint.common.init.ItemInit;
import net.povstalec.techpoint.common.init.TabInit;

@Mod(TechPoint.MODID)
public class TechPoint
{
    public static final String MODID = "techpoint";
    
    public static final Logger LOGGER = LogUtils.getLogger();

    public TechPoint()
    {
    	IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	ItemInit.register(eventBus);
    	BlockInit.register(eventBus);
    	EffectInit.register(eventBus);
    	
    	eventBus.addListener(TabInit::onRegisterModTabs);
        
		MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void commonSetup(final FMLCommonSetupEvent event)
    {
    	event.enqueueWork(() -> 
    	{
    		
    	});
    }

    @Mod.EventBusSubscriber(modid = TechPoint.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        	
        }
    }
    
}
