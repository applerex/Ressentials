package me.applerex;

import me.applerex.commands.gmc;
import me.applerex.commands.gms;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Applerex extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Resentials] plugin has started");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Resentials] plugin has stopped");
    }
}
