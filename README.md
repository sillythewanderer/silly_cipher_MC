# silly cipher: A Minecraft mod that lets you use client side commands to encrypt messages in game

## Download
Download the latest release of the mod from the release page [here](https://github.com/sillythewanderer/silly_cipher_MC/releases/latest)
Please also remember to install [Fabric API](https://modrinth.com/mod/fabric-api) and [Fabric Language Kotlin](https://modrinth.com/mod/fabric-language-kotlin)

For setup instructions, please see the [Fabric Documentation page](https://docs.fabricmc.net/develop/getting-started/creating-a-project#setting-up) related to the IDE that you are using.

## Usage in game
Using the mod is quite simple. All current functionality is in the `/cipher` command. Currently there are three subcommands `encrypt`, `decrypt`, and `encrypt_using_num`.

In general the form for each command is `/cipher <subcommand> <arguments>`

for any text, please ensure that any occurences of the backslash `\` character are double: `\\`,
also ensure that all text (other than numbers and individual characters) is within quote marks: `"___"`.