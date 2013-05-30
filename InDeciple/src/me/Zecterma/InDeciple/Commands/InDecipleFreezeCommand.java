package me.Zecterma.InDeciple.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import me.Zecterma.InDeciple.InDeciple;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InDecipleFreezeCommand implements CommandExecutor {
    
	private InDeciple plugin; // pointer to your main class, unrequired if you don't need methods from the main class

	public InDecipleFreezeCommand(InDeciple plugin) {
	this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("freeze")){
			if (args.length == 0) {
				if (sender.hasPermission("indeciple.freeze")){
					if (plugin.hashmap.containsKey(sender)){
					plugin.hashmap.remove(sender);
					sender.sendMessage(ChatColor.DARK_GREEN + "You unfroze yourself");
				} else {
					plugin.hashmap.put((Player) sender, null);
					sender.sendMessage(ChatColor.DARK_GREEN + "You froze yourself");
					}
				} else {
					sender.sendMessage(ChatColor.DARK_RED + "You don't have permission to freeze yourself!");
				}
				
			} else if (args.length == 1) {
				if (sender.hasPermission("indeciple.freeze.others")) {
					if (sender.getServer().getPlayer(args[0]) != null) {
						Player targetPlayer = sender.getServer().getPlayer(args[0]);
						if (!plugin.hashmap.containsKey(targetPlayer)) {
							sender.sendMessage(ChatColor.DARK_GREEN + "You froze " + targetPlayer.getName() + "!");
							plugin.hashmap.put(targetPlayer, null);
							targetPlayer.sendMessage(ChatColor.DARK_GREEN + "You were frozen by" + sender.getName() + "!");
						} else {
							sender.sendMessage(ChatColor.DARK_GREEN + "You unforze" + targetPlayer.getName() + "!");
							plugin.hashmap.remove(targetPlayer);
							targetPlayer.sendMessage(ChatColor.DARK_GREEN + "You were unfrozen by" + sender.getName() + "!");
							}

					} else {
						sender.sendMessage(ChatColor.DARK_RED + "That player isn't online");
					}
				} else {
					sender.sendMessage(ChatColor.DARK_RED + "You don't have permission to freeze other people!");
				}
			}
		}
		
		
		
		
		
		
		
		return false;
	}
	
}