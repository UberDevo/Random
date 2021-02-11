package me.uberdevo.random.listeners;

import me.uberdevo.random.Random;
import me.uberdevo.random.util.C;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


/**
 * @author UberDevo
 * Copyright @ UberDevo | All rights reserved
 */
public class PlayerJoin implements Listener {

    // Simple example of playing a sound and sending a msg
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.playSound(player.getLocation(), Sound.BLAZE_DEATH, 2F, 1F);
        for (String s : Random.getInstance().getConfig().getStringList("Welcome-Message")){
            player.sendMessage(C.translate(s));
        }
    }
}
