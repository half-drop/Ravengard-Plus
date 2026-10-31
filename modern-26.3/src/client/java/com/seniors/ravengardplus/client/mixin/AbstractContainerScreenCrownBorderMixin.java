package com.seniors.ravengardplus.client.mixin;

import com.seniors.ravengardplus.client.item.CrownBorderRenderer;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractContainerScreen.class)
public class AbstractContainerScreenCrownBorderMixin {
	@Inject(
			method = "extractSlot(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/inventory/Slot;II)V",
			at = @At("TAIL")
	)
	private void ravengardPlus$drawContainerCrownBorder(
			GuiGraphicsExtractor graphics,
			Slot slot,
			int mouseX,
			int mouseY,
			CallbackInfo callbackInfo
	) {
		CrownBorderRenderer.draw(graphics, slot.getItem(), slot.x, slot.y);
	}
}
