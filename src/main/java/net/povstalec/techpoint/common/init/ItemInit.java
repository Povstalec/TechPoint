package net.povstalec.techpoint.common.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.povstalec.techpoint.TechPoint;
import net.povstalec.techpoint.common.items.ChemicalItem;
import net.povstalec.techpoint.common.misc.Chemicals;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TechPoint.MODID);
	
	// Materials
	public static final RegistryObject<ChemicalItem> SALT = ITEMS.register("salt", 
			() -> new ChemicalItem(new Item.Properties(), Chemicals.SODIUM_CHLORIDE));
	public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> ASH = ITEMS.register("ash", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<ChemicalItem> POTASH = ITEMS.register("potash", 
			() -> new ChemicalItem(new Item.Properties(), Chemicals.POTASSIUM_HYRDOXIDE));
	public static final RegistryObject<ChemicalItem> MAGNETITE = ITEMS.register("magnetite", 
			() -> new ChemicalItem(new Item.Properties(), Chemicals.MAGNETITE));
	
	// Food
	public static final RegistryObject<Item> SALTED_BROWN_MUSHROOM = ITEMS.register("salted_brown_mushroom", 
			() -> new Item(new Item.Properties().food(FoodInit.SALTED_MUSHROOM)));
	
	// Chemistry
	public static final RegistryObject<ChemicalItem> NITRIC_ACID_BOWL = ITEMS.register("nitric_acid_bowl", 
			() -> new ChemicalItem(new Item.Properties().craftRemainder(Items.BOWL).stacksTo(1), Chemicals.NITRIC_ACID));
	public static final RegistryObject<ChemicalItem> NITRIC_ACID_BOTTLE = ITEMS.register("nitric_acid_bottle", 
			() -> new ChemicalItem(new Item.Properties().craftRemainder(Items.BOWL).stacksTo(1), Chemicals.NITRIC_ACID));
	public static final RegistryObject<ChemicalItem> SODIUM_CARBONATE = ITEMS.register("sodium_carbonate", 
			() -> new ChemicalItem(new Item.Properties(), Chemicals.SODIUM_CARBONATE));
	public static final RegistryObject<ChemicalItem> POTASSIUM_NITRATE = ITEMS.register("potassium_nitrate", 
			() -> new ChemicalItem(new Item.Properties(), Chemicals.POTASSIUM_NITRATE));
	public static final RegistryObject<ChemicalItem> SULFURIC_ACID_BOTTLE = ITEMS.register("sulfuric_acid_bottle", 
			() -> new ChemicalItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(1), Chemicals.SULFURIC_ACID));
	
	// Useful Items
	public static final RegistryObject<Item> SOAP = ITEMS.register("soap", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MAGNET = ITEMS.register("magnet", 
			() -> new Item(new Item.Properties()));
	
	// Tools
	
	// Armor
	
	public static void register(IEventBus eventBus)
	{
		ITEMS.register(eventBus);
	}
}
