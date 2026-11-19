package com.sillythewanderer.client;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.HoverEvent;

import static com.sillythewanderer.client.Cipher_functionsKt.*;

public class Silly_cipher_commands {

    public static int executeCipherCommand(int encryptionNumber, String plaintext, CommandContext<FabricClientCommandSource> context) {
        String ciphertext = encrypt_with_num(encryptionNumber, plaintext);

        Component output = Component.literal("Cipher result: ")
                .append(Component.literal(ciphertext)
                        .withStyle(ChatFormatting.GOLD, ChatFormatting.UNDERLINE)
                        .withStyle(style -> style
                                .withClickEvent(new ClickEvent.CopyToClipboard(ciphertext))
                                .withHoverEvent(new HoverEvent.ShowText(Component.literal("Click to copy ciphertext")))
                        )
                );

        context.getSource().sendFeedback(output);
        return 1;
    }

    public static int executeCipherCommandEncryptWithNum(int encryptionNumber, String plaintext, CommandContext<FabricClientCommandSource> context) {
        String ciphertext = encrypt_with_num(encryptionNumber, plaintext);

        Component output = Component.literal("Cipher result: ")
                .append(Component.literal(ciphertext)
                        .withStyle(ChatFormatting.GOLD, ChatFormatting.UNDERLINE)
                        .withStyle(style -> style
                                .withClickEvent(new ClickEvent.CopyToClipboard(ciphertext))
                                .withHoverEvent(new HoverEvent.ShowText(Component.literal("Click to copy ciphertext")))
                        )
                );

        context.getSource().sendFeedback(output);
        return 1;
    }


    public static int executeCipherCommandEncrypt(String plaintext, CommandContext<FabricClientCommandSource> context) {
        String ciphertext = encrypt(plaintext);

        Component output = Component.literal("Cipher result: ")
                .append(Component.literal(ciphertext)
                        .withStyle(ChatFormatting.GOLD, ChatFormatting.UNDERLINE)
                        .withStyle(style -> style
                                .withClickEvent(new ClickEvent.CopyToClipboard(ciphertext))
                                .withHoverEvent(new HoverEvent.ShowText(Component.literal("Click to copy ciphertext")))
                        )
                );

        context.getSource().sendFeedback(output);
        return 1;
    }

    public static int executeCipherCommandDecrypt(String plaintext, CommandContext<FabricClientCommandSource> context) {
        String ciphertext = decrypt(plaintext);

        Component output = Component.literal("Cipher result: ")
                .append(Component.literal(ciphertext)
                        .withStyle(ChatFormatting.GOLD, ChatFormatting.UNDERLINE)
                        .withStyle(style -> style
                                .withClickEvent(new ClickEvent.CopyToClipboard(ciphertext))
                                .withHoverEvent(new HoverEvent.ShowText(Component.literal("Click to copy ciphertext")))
                        )
                );

        context.getSource().sendFeedback(output);
        return 1;
    }

}
