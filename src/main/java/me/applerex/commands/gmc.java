package me.applerex.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gmc implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Sorry, only players can use this command");
            return true;
        }

        Player player = (Player) sender;
        if(command.getName().equalsIgnoreCase("gmc")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.GOLD + "Gamemode was set to Creative");
            return true;
        }

        return true;
    }
}
