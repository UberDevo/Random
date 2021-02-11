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
public class BadBoyChillerCrewCommand extends BaseCMD {
    @Completer(name = "bbcc", aliases = {"badboychillercrew", "badboy"})
    @Command(name = "bbcc", aliases = {"badboychillercrew", "badboy"}, inGameOnly = true)
    @Override
    public void onCommand(CommandArgs cmd) {
        Player p = cmd.getPlayer();
        p.sendMessage(C.translate("&6&lCheck out this sick song https://youtu.be/bSasFioVIvo"));
    }
}
