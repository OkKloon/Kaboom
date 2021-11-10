package me.powerbutton.kaboom;

import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameRule;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class Bigkaboom implements CommandExecutor {
    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e) {
        if (e.getCause() == DamageCause.FALL) {
            e.setCancelled(true);
        }

    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("bigkaboom")) {
            if (!sender.hasPermission("bigkaboom.use")) {
                sender.sendMessage(CommonStrings.NO_PERMISSIONS);
            } else {
                    if (command.getName().equalsIgnoreCase("bigkaboom")) {
                        if (args.length == 0) {

                            Methods m = new Methods();
                            for (Player players : Bukkit.getOnlinePlayers()) {
                                m.bigKaboom(players);
                            }
                        } else {
                            Player target = Bukkit.getPlayerExact(args[0]);
                            if (target != null) {
                                Methods m = new Methods();
                                m.bigKaboom(target);
                            } else {
                                sender.sendMessage(CommonStrings.PLAYER_NOT_ONLINE);
                            }
                        }
                    }

                }
            }
        return false;
    }
}