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
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (command.getName().equalsIgnoreCase("gravity")) {
        if (!sender.hasPermission("gravity.use")) {
            sender.sendMessage(CommonStrings.NO_PERMISSIONS);
        } else {
            if (args.length == 0) {
                for (Player players :  Bukkit.getOnlinePlayers()) {
                    players.setVelocity(new Vector(0, -100, 0));
                    players.playSound(players.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 1000, 1f);
                    players.sendTitle(ChatColor.YELLOW + "" + ChatColor.BOLD + "GRAVITY", " ", 0, 60, 0);
                }
                } else {

                Player target = Bukkit.getPlayerExact(args[0]);
                if (target != null) {
                    target.setVelocity(new Vector(0, -100, 0));
                    target.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "You have been pulled to the ground by " + sender.getName());
                    target.playSound(target.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 1000, 1f);
                    target.sendTitle(ChatColor.YELLOW + "" + ChatColor.BOLD + "GRAVITY", "", 0, 60, 0);

                } else {
                    sender.sendMessage(CommonStrings.PLAYER_NOT_ONLINE);
                }
            }
        }
        }
    return true;
       }
}