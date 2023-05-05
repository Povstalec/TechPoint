package net.povstalec.techpoint.common.effects;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class CleanEffect extends MobEffect
{
	public CleanEffect(MobEffectCategory category, int color)
	{
		super(category, color);
	}
	
	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier)
	{
		
		
		super.applyEffectTick(entity, amplifier);
	}
	
	@Override
	public boolean isDurationEffectTick(int duration, int amplifier)
	{
		return true;
	}
	
	@Override
	public List<ItemStack> getCurativeItems()
	{
		return new ArrayList<ItemStack>();
	}
}
