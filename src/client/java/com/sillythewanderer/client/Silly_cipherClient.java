package com.sillythewanderer.client;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.ClientCommands;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

import static com.sillythewanderer.client.Silly_cipher_commands.executeCipherCommand;

public class Silly_cipherClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		ClientCommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext) -> {
			dispatcher.register(ClientCommands.literal("cipher").then(ClientCommands.literal("encrypt")
					.then(ClientCommands.argument("encryption_number", IntegerArgumentType.integer())
							.then(ClientCommands.argument("plaintext", StringArgumentType.string())
									.executes(context -> Silly_cipher_commands.executeCipherCommandEncrypt(
											IntegerArgumentType.getInteger(context, "encryption_number"),
											StringArgumentType.getString(context, "plaintext"),
											context))))));
		});




	}
}