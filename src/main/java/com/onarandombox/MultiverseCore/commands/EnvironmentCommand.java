package com.onarandombox.MultiverseCore.commands;

import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import com.onarandombox.MultiverseCore.MultiverseCore;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

@CommandAlias("mv")
public class EnvironmentCommand extends MultiverseCommand {

    public EnvironmentCommand(MultiverseCore plugin) {
        super(plugin);
    }

    @Subcommand("env|environments")
    @CommandPermission("multiverse.core.list.environments")
    @Description("Lists valid known environments/world types.")
    public void onEnvironmentCommand(CommandSender sender) {
        showEnvironments(sender);
        sender.sendMessage(" ");
        showWorldTypes(sender);
    }

    /**
     * Shows all valid known environments to a {@link CommandSender}.
     *
     * @param sender The {@link CommandSender}.
     */
    public static void showEnvironments(CommandSender sender) {
        sender.sendMessage(ChatColor.YELLOW + "Valid Environments are:");
        sender.sendMessage(String.format("%sNORMAL%s, %sNETHER %sor %sEND",
                ChatColor.GREEN, ChatColor.WHITE, ChatColor.RED, ChatColor.WHITE, ChatColor.AQUA));
    }

    /**
     * Shows all valid known world types to a {@link CommandSender}.
     *
     * @param sender The {@link CommandSender}.
     */
    public static void showWorldTypes(CommandSender sender) {
        sender.sendMessage(ChatColor.YELLOW + "Valid World Types are:");
        sender.sendMessage(String.format("%sNORMAL%s, %sFLAT%s, %sLARGEBIOMES %sor %sAMPLIFIED",
                ChatColor.GREEN, ChatColor.WHITE, ChatColor.AQUA, ChatColor.WHITE, ChatColor.RED, ChatColor.WHITE, ChatColor.GOLD));
    }
}
