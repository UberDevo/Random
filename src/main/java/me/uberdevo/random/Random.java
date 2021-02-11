package me.uberdevo.random;

import lombok.Getter;
import me.uberdevo.random.listeners.PlayerJoin;
import me.uberdevo.random.mongo.MongoManager;
import me.uberdevo.random.util.RegisterHandler;
import me.uberdevo.random.util.command.CommandFramework;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author UberDevo
 * Copyright @ UberDevo | All rights reserved
 */

@Getter
public class Random extends JavaPlugin {

    @Getter
    public static Random instance;

    @Getter
    private MongoManager mongoManager;

    private CommandFramework commandFramework;

    public void onEnable(){
        saveDefaultConfig();
        instance = this;
        mongoManager = new MongoManager();
        commandFramework = new CommandFramework(this);
        loadCommands();
        registerListeners();
    }

    public void registerListeners(){
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(new PlayerJoin(), this);
    }

    private void loadCommands() {
        RegisterHandler.loadCommandsFromPackage(this, "me.uberdevo.random.command");
    }


}
