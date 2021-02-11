package me.uberdevo.random.command;

import me.uberdevo.random.Random;
import me.uberdevo.random.util.C;
import me.uberdevo.random.util.command.BaseCMD;
import me.uberdevo.random.util.command.Command;
import me.uberdevo.random.util.command.CommandArgs;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author UberDevo
 * Copyright @ UberDevo | All rights reserved
 */
public class BroadcastCommand extends BaseCMD {
    @Command(name = "broadcast", permission = "command.bc", aliases = {"bc","alert"}, inGameOnly = true)

    @Override
    public void onCommand(CommandArgs cmd){
        CommandSender p = cmd.getPlayer();
        String[] args = cmd.getArgs();
        if (args.length == 0){
            p.sendMessage(C.translate("&cUsage: /" + cmd.getLabel() + " {MSG}"));
            return;
        }
        List<String> msg = new ArrayList<>();
        Collections.addAll(msg, args);
        Bukkit.broadcastMessage(C.translate(Random.getInstance().getConfig().getString("BC"))
                .replace("{MSG}", StringUtils.join(msg, " ")));
    }
}