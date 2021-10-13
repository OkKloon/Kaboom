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
            } else {
                Iterator var5 = Bukkit.getOnlinePlayers().iterator();

                while(var5.hasNext()) {
                    Player players = (Player)var5.next();
                    Bukkit.getOnlinePlayers();
                    if (command.getName().equalsIgnoreCase("kaboom")) {
                        players.setVelocity(new Vector(0, 130, 0));
                    }

                    players.getWorld().strikeLightningEffect(players.getLocation());
                    players.playSound(players.getLocation(), Sound.BLOCK_ANVIL_LAND, 99999.0F, 1.0F);
                    players.sendMessage("§e§lKABOOM!");
                    players.sendTitle("§e§lKABOOM", "", 0, 40, 0);
                }
            }
        }

        return true;
    }
}