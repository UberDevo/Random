package me.uberdevo.random.util.command;


import me.uberdevo.random.Random;

public abstract class BaseCMD {
    public Random plugin = Random.getInstance();

    public BaseCMD(){
        this.plugin.getCommandFramework().registerCommands(this);
    }
    
    public abstract void onCommand(CommandArgs cmd);
}
