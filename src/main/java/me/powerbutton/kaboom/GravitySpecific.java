package me.powerbutton.kaboom;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class GravitySpecific implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("gravityspecific")) {
            if (!sender.hasPermission("kaboomspecific.use")) {
                sender.sendMessage(ChatColor.RED + "§l[kaboom.] You do not have the permission to use this command!");
            } else if (args.length > 0) {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target == null) {
                    sender.sendMessage(ChatColor.RED + "This player does not exist or is not online!");
                } else {
                    target.sendMessage(ChatColor.RED + sender.getName() + " §bsent you in the earth core!!");
                    target.setVelocity(new Vector(0, -130, 0));
                    target.playSound(target.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 99999.0F, 1.0F);
                    target.sendTitle("", "", 0, 80, 0);
                }
            } else if (args.length >= 0) {
                sender.sendMessage(ChatColor.RED + "[kaboom.] Missing arguments! The correct usage of this command is /gravityspecific <playername>");
            }


        }

        return true;
    }
}