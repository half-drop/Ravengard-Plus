package com.seniors.ravengardplus.client.mixin;

import com.seniors.ravengardplus.client.item.CrownBorderRenderer;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractContainerScreen.class)
public class AbstractContainerScreenCrownBorderMixin {
	@Inject(method = "renderSlotContents", at = @At("HEAD"))
	private void ravengardPlus$drawContainerCrownBorder(
			GuiGraphicsExtractor graphics,
			ItemStack itemStack,
			Slot slot,
			String itemCount,
			CallbackInfo callbackInfo
	) {
		CrownBorderRenderer.draw(graphics, itemStack, slot.x, slot.y);
	}
}
