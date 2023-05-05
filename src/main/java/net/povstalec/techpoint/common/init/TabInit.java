package net.povstalec.techpoint.common.init;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.povstalec.techpoint.TechPoint;

@Mod.EventBusSubscriber(modid = TechPoint.MODID)
public class TabInit
{
	@SubscribeEvent
	public static void onRegisterModTabs(final CreativeModeTabEvent.Register event)
	{
		event.registerCreativeModeTab(new ResourceLocation(TechPoint.MODID, "techpoint_items"), (builder) ->
		{
			builder.title(Component.translatable("itemGroup.techpoint_items"))
			.icon(() -> new ItemStack(ItemInit.SALT.get()))
			.displayItems((flag, items, hasPermisions) ->
			{
				// Materials
				items.accept(ItemInit.SALT.get());
				items.accept(ItemInit.SULFUR.get());
				items.accept(ItemInit.ASH.get());
				items.accept(ItemInit.POTASH.get());
				items.accept(ItemInit.MAGNETITE.get());

				// Food
				items.accept(ItemInit.SALTED_BROWN_MUSHROOM.get());
				
				// Chemistry
				items.accept(ItemInit.NITRIC_ACID_BOWL.get());
				items.accept(ItemInit.NITRIC_ACID_BOTTLE.get());
				items.accept(ItemInit.SODIUM_CARBONATE.get());
				items.accept(ItemInit.POTASSIUM_NITRATE.get());
				items.accept(ItemInit.SULFURIC_ACID_BOTTLE.get());
				
				// Useful Items
				items.accept(ItemInit.SOAP.get());
				items.accept(ItemInit.MAGNET.get());
			});
		});
		
		event.registerCreativeModeTab(new ResourceLocation(TechPoint.MODID, "techpoint_blocks"), (builder) ->
		{
			builder.title(Component.translatable("itemGroup.techpoint_blocks"))
			.icon(() -> new ItemStack(BlockInit.GUNPOWDER_BARREL.get()))
			.displayItems((flag, items, hasPermisions) ->
			{
				// Functional Blocks
				items.accept(BlockInit.GUNPOWDER_BARREL.get());
			});
		});
	}
}
