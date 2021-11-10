package me.powerbutton.kaboom;

import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class KaboomCommand implements CommandExecutor {
    ArrayList<String> cancelfall = new ArrayList();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("kaboom")) {
            if (!sender.hasPermission("kaboom.use")) {

                sender.sendMessage(ChatColor.RED + "§l[kaboom] You do not have the permission to use this command!");


            }  if (args.length == 0){
              for   (Player players : Bukkit.getOnlinePlayers()) {
                  players.getWorld().strikeLightningEffect(players.getLocation());
                  players.sendMessage("§e§lKABOOM!");
                  players.sendTitle("§e§lKABOOM", "", 0, 40, 0);
                  players.setVelocity(new Vector(0, 10, 0));
              }
            }else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target != null) {
                    target.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "You have been kaboomed by " + sender.getName());
                    target.setVelocity(new Vector(0, 10, 0));
                    target.sendMessage("§e§lKABOOM!");
                    target.sendTitle("§e§lKABOOM", "", 0, 40, 0);
                    target.getWorld().strikeLightningEffect(target.getLocation());
                } else {
                    sender.sendMessage(CommonStrings.PLAYER_NOT_ONLINE);
                }
                }
            }
        return true;

    }

    }