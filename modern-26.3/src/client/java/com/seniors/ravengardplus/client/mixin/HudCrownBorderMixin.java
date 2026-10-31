package com.seniors.ravengardplus.client.mixin;

import com.seniors.ravengardplus.client.item.CrownBorderRenderer;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.Hud;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Hud.class)
public class HudCrownBorderMixin {
	@Inject(
			method = "extractSlot(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IILnet/minecraft/client/DeltaTracker;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;I)V",
			at = @At("HEAD")
	)
	private void ravengardPlus$drawHotbarCrownBorder(
			GuiGraphicsExtractor graphics,
			int x,
			int y,
			DeltaTracker deltaTracker,
			Player player,
			ItemStack itemStack,
			int seed,
			CallbackInfo callbackInfo
	) {
		CrownBorderRenderer.draw(graphics, itemStack, x, y);
	}
}
