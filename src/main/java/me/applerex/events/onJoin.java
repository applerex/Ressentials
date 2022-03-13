package me.applerex.events;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Annotation;

public class onJoin implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String player_name = String.valueOf(player.displayName());
        event.setJoinMessage(ChatColor.GOLD + "Welcome to the server");
    }

}