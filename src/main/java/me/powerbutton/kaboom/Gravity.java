package me.powerbutton.kaboom;

import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Gravity implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!command.getName().equalsIgnoreCase("gravity")) {
            return false;
        } else {
            if (!sender.hasPermission("gravity.use")) {
                sender.sendMessage(ChatColor.RED + "[kaboom.] You do not have the permission to use this command!");
            } else {
                Iterator var5 = Bukkit.getOnlinePlayers().iterator();

                while(var5.hasNext()) {
                    Player players = (Player)var5.next();
                    Player player = (Player)sender;
                    Bukkit.getOnlinePlayers();
                    if (command.getName().equalsIgnoreCase("gravity")) {
                        players.setVelocity(new Vector(0, -500, 0));
                    }
                    players.setFallDistance(0.0F);
                    players.sendMessage("§e§lGRAVITY GO NYOOOM!");
                    players.playSound(players.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 99999.0F, 1.0F);
                    players.sendTitle("§e§lGRAVITY", "", 0, 40, 0);
                }
            }
            return true;
        }
    }
}