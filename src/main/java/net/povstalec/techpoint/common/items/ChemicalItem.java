package net.povstalec.techpoint.common.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ChemicalItem extends Item
{
	protected final String literalTooltip;
	
	public ChemicalItem(Properties properties, String literalTooltip)
	{
		super(properties);
		this.literalTooltip = literalTooltip;
	}
	
	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced)
	{
		components.add(Component.literal(literalTooltip).withStyle(ChatFormatting.GRAY));
		
		super.appendHoverText(stack, level, components, isAdvanced);
	}
}
