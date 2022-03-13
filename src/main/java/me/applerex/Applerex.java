package me.applerex;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Applerex extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Resentials] plugin has started");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Resentials] plugin has stopped, you may need to download LuckPerms (only if you dont have it already).");
    }
}
