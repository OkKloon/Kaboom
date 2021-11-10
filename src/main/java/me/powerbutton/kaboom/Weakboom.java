package me.powerbutton.kaboom;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Weakboom implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (command.getName().equalsIgnoreCase("weakboomspecific")) {
            if (!sender.hasPermission("kaboomspecific.use")) {
           sender.sendMessage(CommonStrings.NO_PERMISSIONS);
            } else {
                if (args.length == 0) {
                    for (Player players : Bukkit.getOnlinePlayers()) {
                        players.setVelocity(new Vector(0, 50, 0));
                        players.sendTitle(ChatColor.YELLOW + "" + ChatColor.BOLD + "WEAK", "", 0, 60, 0);
                        players.playSound(players.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 1000, 1f);
                    }
                } else {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target != null) {
                        target.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "You have been weakboomed by " + sender.getName());
                        target.setVelocity(new Vector(0, 50, 0));
                        target.sendTitle(ChatColor.YELLOW + "" + ChatColor.BOLD + "WEAK", "", 0, 60, 0);
                        target.playSound(target.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 1000, 1f);
                    } else {
                        sender.sendMessage(CommonStrings.PLAYER_NOT_ONLINE);
                    }
                }
            }
        }
 return true;
    }
}