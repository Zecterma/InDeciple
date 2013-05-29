package me.Zecterma.InDeciple.Commands;

import me.Zecterma.InDeciple.InDeciple;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class InDecipleFlyCommand implements CommandExecutor {
	public InDecipleFlyCommand(InDeciple InDecipleFlyCommand) {
	}

  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("f")) {
      if ((sender instanceof Player)) {
        Player player = (Player)sender;
        if (args.length == 0) {
          if (player.hasPermission("indeciplefly.fly"))
            if (player.getAllowFlight()) {
              player.setFlying(false);
              player.setAllowFlight(false);
              player.sendMessage("Disabled fly mode!");
            } else {
              player.setAllowFlight(true);
              player.setFlySpeed(0.1F);
              player.sendMessage("Enabled fly mode!");
            }
        }
        else if (args.length == 1) {
          if (player.hasPermission("indeciplefly.other")) {
            Player otherplayer = Bukkit.getPlayer(args[0]);
            if (otherplayer != null) {
              if (otherplayer.getAllowFlight()) {
                otherplayer.setFlying(false);
                otherplayer.setAllowFlight(false);
                otherplayer.sendMessage("Disabled fly mode!");
                player.sendMessage(args[0] + 
                  " was put out of fly mode!");
              } else {
                otherplayer.setAllowFlight(true);
                otherplayer.setFlySpeed(0.1F);
                otherplayer.sendMessage("Enabled fly mode!");
                player.sendMessage(args[0] + 
                  " was sent to sky!");
              }
            }
            else player.sendMessage(args[0] + 
                " is not online or doesn't exist!");
          }
        }
        else {
          return false;
        }
      }
      return true;
    }if (cmd.getName().equalsIgnoreCase("fspeed")) {
      Player player = (Player)sender;
      if ((sender instanceof Player)) {
        if (args.length == 0)
          return false;
        if (args.length == 1) {
          int speed = 1;
          try {
            speed = Integer.parseInt(args[0]);
          } catch (NumberFormatException e) {
            player.sendMessage("Only integer values are allowed here");
            return true;
          }

          if ((player.hasPermission("indeciplefly.speed") | 
            player.hasPermission("indeciplefly.speed.10"))) {
            if ((speed < -10) || (speed > 10)) {
              player.sendMessage("Speed can't be less than -10 or more than 10");
            } else {
              player.setFlySpeed(speed / 10.0F);
              player.sendMessage("Flyspeed set to " + speed);
            }
            return true;
          }if (player.hasPermission("fly.speed.9")) {
            if ((speed <= 9) && (speed >= -9)) {
              player.setFlySpeed(speed / 10.0F);
              player.sendMessage("Flyspeed set to " + speed);
            } else {
              player.sendMessage("You don't have permission to do that");
            }
            return true;
          }if (player.hasPermission("indeciplefly.speed.8")) {
            if ((speed <= 8) && (speed >= -8)) {
              player.setFlySpeed(speed / 10.0F);
              player.sendMessage("Flyspeed set to " + speed);
            } else {
              player.sendMessage("You don't have permission to do that");
            }
            return true;
          }if (player.hasPermission("indeciplefly.speed.7")) {
            if ((speed <= 7) && (speed >= -7)) {
              player.setFlySpeed(speed / 10.0F);
              player.sendMessage("Flyspeed set to " + speed);
            } else {
              player.sendMessage("You don't have permission to do that");
            }
            return true;
          }if (player.hasPermission("indeciplefly.speed.6")) {
            if ((speed <= 6) && (speed >= -6))
              player.setFlySpeed(speed / 10.0F);
            else {
              player.sendMessage("You don't have permission to do that");
            }
            return true;
          }if (player.hasPermission("indeciplefly.speed.5")) {
            if ((speed <= 5) && (speed >= -5)) {
              player.setFlySpeed(speed / 10.0F);
              player.sendMessage("Flyspeed set to " + speed);
            } else {
              player.sendMessage("You don't have permission to do that");
            }
            return true;
          }if (player.hasPermission("indeciplefly.speed.4")) {
            if ((speed <= 4) && (speed >= -4)) {
              player.setFlySpeed(speed / 10.0F);
              player.sendMessage("Flyspeed set to " + speed);
            } else {
              player.sendMessage("You don't have permission to do that");
            }
            return true;
          }if (player.hasPermission("indeciplefly.speed.3")) {
            if ((speed <= 3) && (speed >= -3)) {
              player.setFlySpeed(speed / 10.0F);
              player.sendMessage("Flyspeed set to " + speed);
            } else {
              player.sendMessage("You don't have permission to do that");
            }
            return true;
          }if (player.hasPermission("indeciplefly.speed.2")) {
            if ((speed <= 2) && (speed >= -2)) {
              player.setFlySpeed(speed / 10.0F);
              player.sendMessage("Flyspeed set to " + speed);
            } else {
              player.sendMessage("You don't have permission to do that");
            }
            return true;
          }
          player.sendMessage("You don't have permission to do that");

          return true;
        }
      }
    }

    return false;
  }

  @EventHandler(priority=EventPriority.NORMAL)
  public void onHit(EntityDamageByEntityEvent event)
  {
    if ((event.getDamager() instanceof Player)) {
      Player damager = (Player)event.getDamager();
      if ((damager.getAllowFlight()) && 
        (!damager.hasPermission("Fly.damage")) && 
        (damager.getGameMode() != GameMode.CREATIVE))
        event.setCancelled(true);
    }
  }

  @EventHandler(priority=EventPriority.NORMAL)
  public void onDamage(EntityDamageEvent event)
  {
    if ((event.getEntity() instanceof Player)) {
      Player receiver = (Player)event.getEntity();
      if ((receiver.isFlying()) && 
        (receiver.hasPermission("indeciplefly.invincible")))
        event.setCancelled(true);
    }
  }

  @EventHandler(priority=EventPriority.NORMAL)
  public void onWorldChange(PlayerChangedWorldEvent event)
  {
    Player player = event.getPlayer();
    if ((player.getAllowFlight()) && 
      (player.getGameMode() != GameMode.CREATIVE) && 
      (!player.hasPermission("indeciplefly.worldchange"))) {
      player.setFlying(false);
      player.setAllowFlight(false);
    }
  }
}