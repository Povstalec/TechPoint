package net.povstalec.techpoint.common.init;

import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.povstalec.techpoint.TechPoint;
import net.povstalec.techpoint.common.blocks.GunpowderBarrelBlock;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TechPoint.MODID);
	
	// Natural Blocks
	
	// Functional Blocks
	public static final RegistryObject<GunpowderBarrelBlock> GUNPOWDER_BARREL = registerBlock("gunpowder_barrel", 
			() -> new GunpowderBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	
	// Entity Blocks
	
	
	
	private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
	{
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		
		registerBlockItem(name, toReturn);
		
		return toReturn;
	}
	
	private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
	{
		return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}
	
	public static void register(IEventBus eventBus)
	{
		BLOCKS.register(eventBus);
	}
}
