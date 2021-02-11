package me.uberdevo.random.command;

import me.uberdevo.random.util.C;
import me.uberdevo.random.util.command.BaseCMD;
import me.uberdevo.random.util.command.Command;
import me.uberdevo.random.util.command.CommandArgs;
import me.uberdevo.random.util.command.Completer;
import org.bukkit.entity.Player;

/**
 * @author UberDevo
 * Copyright @ UberDevo | All rights reserved
 */
public class RandomCommand extends BaseCMD {
    // This is a simple Command :)
    @Completer(name = "random", aliases = {"randomemems", "memes"})
    @Command(name = "random", aliases = {"randomemems", "memes"}, inGameOnly = true)
    @Override
    public void onCommand(CommandArgs cmd) {
        Player p = cmd.getPlayer();
        p.sendMessage(C.translate("&6&lYou are the player called " + p.getName()));
    }
}
