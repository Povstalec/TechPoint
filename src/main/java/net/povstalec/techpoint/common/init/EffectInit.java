package net.povstalec.techpoint.common.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.povstalec.techpoint.TechPoint;
import net.povstalec.techpoint.common.effects.CleanEffect;

public class EffectInit
{
	public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TechPoint.MODID);
	
	public static final RegistryObject<MobEffect> CLEAN = EFFECTS.register("clean", () -> new CleanEffect(MobEffectCategory.NEUTRAL, 3124687));
	
	public static void register(IEventBus eventBus)
	{
		EFFECTS.register(eventBus);
	}
}
