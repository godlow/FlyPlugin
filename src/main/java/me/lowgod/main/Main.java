package me.lowgod.main;

import me.lowgod.main.commands.FlyCommand;
import me.lowgod.main.utils.utils;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin {

    ConsoleCommandSender c = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {


        c.sendMessage(utils.chat("&d -- Advanced Fly -- \n                      &5By: &5&lLowgod\n                 &9Discord: &9&llowgod#9999"));

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("fly").setExecutor(new FlyCommand());


    }

}
