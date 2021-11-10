package me.powerbutton.kaboom;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Kaboom extends JavaPlugin {
    private static Kaboom instance;

    public static Kaboom getInstance() {
        return instance;
    }
    @Override
    public void onEnable(){
        // Plugin startup logic
        instance = this;
        Logger logger = this.getLogger();
        Bukkit.getLogger().info("Kaboom is starting up!");
        this.getCommand("kaboom").setExecutor(new KaboomCommand());
        this.getCommand("gravity").setExecutor(new Gravity());
        this.getCommand("bigkaboom").setExecutor(new Bigkaboom());
        Bukkit.getLogger().info("Kaboom has started up!");
    }

    @Override
    public void onDisable(){
        // Plugin shutdown logic
        Bukkit.getLogger().info("Kaboom is shutting down! See you next time!");
    }
}
