package de.maxhenkel.easyvillagers.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import de.maxhenkel.corelib.inventory.ScreenBase;
import de.maxhenkel.easyvillagers.Main;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.TranslationTextComponent;

public class OutputScreen extends ScreenBase<OutputContainer> {

    public static final ResourceLocation BACKGROUND = new ResourceLocation(Main.MODID, "textures/gui/container/output.png");

    private PlayerInventory playerInventory;

    public OutputScreen(OutputContainer container, PlayerInventory playerInventory, ITextComponent name) {
        super(BACKGROUND, container, playerInventory, name);
        this.playerInventory = playerInventory;
        xSize = 176;
        ySize = 133;
    }

    @Override
    protected void func_230451_b_(MatrixStack matrixStack, int mouseX, int mouseY) {
        drawCentered(matrixStack, new TranslationTextComponent("gui.easy_villagers.output"), 9, FONT_COLOR);
        field_230712_o_.func_238422_b_(matrixStack, playerInventory.getDisplayName(), 8F, (float) (ySize - 96 + 3), FONT_COLOR);
    }

    protected void drawCentered(MatrixStack matrixStack, ITextProperties text, int y, int color) {
        int width = field_230712_o_.getStringWidth(text.getString());
        field_230712_o_.func_238422_b_(matrixStack, text, xSize / 2F - width / 2F, y, color);
    }

}