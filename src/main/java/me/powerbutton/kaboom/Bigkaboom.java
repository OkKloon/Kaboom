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
                sender.sendMessage(ChatColor.RED + "[kaboom] You do not have the permission to use this command!");
            } else {
                Iterator var5 = Bukkit.getOnlinePlayers().iterator();

                while(var5.hasNext()) {
                    Player players = (Player)var5.next();
                    Player player = (Player)sender;
                    Bukkit.getOnlinePlayers();
                    if (command.getName().equalsIgnoreCase("bigkaboom")) {
                        players.sendTitle(ChatColor.RED + "§lI DON'T THINK YOU ARE READY", "§cARE YOU SURE YOU WANT TO PROCEED?", 0, 60, 0);
                    }

                    players.playSound(players.getLocation(), Sound.ENTITY_WITHER_AMBIENT, 99999.0F, 1.0F);
                    System.out.println("w");
                    players.sendMessage(ChatColor.GREEN + "Fall damage has been turned §lOFF");
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lWELL, HERE GOES NOTHING!", "", 0, 70, 0);
                    }, 60L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_WITHER_AMBIENT, 99999.0F, 1.0F);
                    }, 60L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§l3", "", 0, 60, 0);
                    }, 120L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.GOLD + "§l2", "", 0, 60, 0);
                    }, 140L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.GREEN + "§l1", "", 0, 60, 0);
                    }, 160L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 99999.0F, 0.5F);
                    }, 120L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 99999.0F, 0.7F);
                    }, 140L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 99999.0F, 1.0F);
                    }, 160L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 180L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 180L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHA", "", 0, 60, 0);
                    }, 180L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lYOU THOUGHT THIS IS ALL OF MY POWER?", "", 0, 70, 0);
                    }, 280L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_WITHER_AMBIENT, 99999.0F, 1.0F);
                    }, 280L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lOH BOY HOW WRONG YOU ARE!", "", 0, 60, 0);
                    }, 340L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_WITHER_AMBIENT, 99999.0F, 1.0F);
                    }, 340L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 410L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 410L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 420L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 420L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 430L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 430L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 440L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 440L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHA", "", 0, 60, 0);
                    }, 415L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHA", "", 0, 60, 0);
                    }, 418L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHA", "", 0, 60, 0);
                    }, 421L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHA", "", 0, 60, 0);
                    }, 424L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHA", "", 0, 60, 0);
                    }, 427L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHA", "", 0, 60, 0);
                    }, 430L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHAHA", "", 0, 60, 0);
                    }, 433L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHAHAHA", "", 0, 60, 0);
                    }, 436L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHAHAHAHA", "", 0, 60, 0);
                    }, 439L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHAHAHAHAHA", "", 0, 60, 0);
                    }, 442L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHAHAHAHAHAHA", "", 0, 60, 0);
                    }, 445L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHAHAHAHAHAHAHA", "", 0, 60, 0);
                    }, 448L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHAHAHAHAHAHAHAHA", "", 0, 60, 0);
                    }, 451L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lMUAHAHAHAHAHAHAHAHAHAHAHAHAHAHA", "", 0, 110, 0);
                    }, 454L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lTHIS IS ONLY THE BEGINNING!", "", 0, 110, 0);
                    }, 584L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_WITHER_AMBIENT, 99999.0F, 1.0F);
                    }, 584L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 600L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 600L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 600L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 610L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 610L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 610L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 620L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 620L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 620L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 630L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 630L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 630L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 640L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 640L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 640L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 650L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 650L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 650L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 650L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 650L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 650L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 660L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 660L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 800L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, -130, 0));
                    }, 820L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 99999.0F, 1.0F);
                    }, 800L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.BLOCK_ANVIL_LAND, 99999.0F, 1.0F);
                    }, 820L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 660L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 830L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 850L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 860L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 870L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 880L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 890L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 900L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 910L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 920L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 930L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 940L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 950L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 960L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 970L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 980L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 990L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 1000L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 1010L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.setVelocity(new Vector(0, 130, 0));
                    }, 1020L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 830L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 850L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 860L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 870L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 880L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 890L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 900L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 910L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 920L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 930L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 940L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 950L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 960L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 970L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 980L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 990L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 1000L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 1010L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 1020L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 150, 1));
                    }, 1100L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendMessage(ChatColor.AQUA + "You suddenly feel dizzy from the huge height, thus, you become dizzy");
                    }, 1100L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_ZOMBIE_DEATH, 99999.0F, 0.5F);
                    }, 1100L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lI", "", 0, 20, 0);
                    }, 1310L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lWILL", "", 0, 20, 0);
                    }, 1320L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lRETURN.", "", 0, 80, 0);
                    }, 1330L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lTHIS", "", 0, 20, 0);
                    }, 1390L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lIS", "", 0, 20, 0);
                    }, 1400L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lONLY", "", 0, 20, 0);
                    }, 1410L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lTHE", "", 0, 20, 0);
                    }, 1420L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendTitle(ChatColor.RED + "§lBEGINNING.", "", 0, 60, 0);
                    }, 1430L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 1490L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 1500L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.getWorld().strikeLightningEffect(players.getLocation());
                    }, 1510L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 99999.0F, 1.5F);
                    }, 1490L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.playSound(players.getLocation(), Sound.ENTITY_ENDER_DRAGON_DEATH, 99999.0F, 1.5F);
                    }, 1310L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        ((World)Bukkit.getWorlds().get(0)).setGameRule(GameRule.FALL_DAMAGE, true);
                    }, 1400L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        ((World)Bukkit.getWorlds().get(1)).setGameRule(GameRule.FALL_DAMAGE, true);
                    }, 1400L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        ((World)Bukkit.getWorlds().get(2)).setGameRule(GameRule.FALL_DAMAGE, true);
                    }, 1400L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        ((World)Bukkit.getWorlds().get(0)).setGameRule(GameRule.FALL_DAMAGE, false);
                    }, 0L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        ((World)Bukkit.getWorlds().get(1)).setGameRule(GameRule.FALL_DAMAGE, false);
                    }, 0L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        ((World)Bukkit.getWorlds().get(2)).setGameRule(GameRule.FALL_DAMAGE, false);
                    }, 0L);
                    Bukkit.getScheduler().runTaskLater(Kaboom.getInstance(), () -> {
                        players.sendMessage(ChatColor.RED + "Fall damage has been turned §lON");
                    }, 1400L);
                }
            }
        }

        return false;
    }
}