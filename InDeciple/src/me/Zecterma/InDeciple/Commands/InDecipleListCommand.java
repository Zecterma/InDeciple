package me.Zecterma.InDeciple.Commands;



import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import me.Zecterma.InDeciple.InDeciple;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InDecipleListCommand implements CommandExecutor {
    
	public InDecipleListCommand(InDeciple indeciple) {
	}
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		if (cs instanceof Player) {
			if(args.length != 1) {
				cs.sendMessage(ChatColor.DARK_RED + "Wrong number of parameters");
				return true;
			}
			
			
			
			
			if (label.equalsIgnoreCase("indeciple list")) {
				cs.sendMessage(ChatColor.DARK_PURPLE + "/g " + ChatColor.DARK_GREEN + "- Switches gamemode");
				
			} else {
						cs.sendMessage(ChatColor.DARK_RED + "Something went wrong.");
						return true;
					}
					
				}
				

		
		
		
		return true;
	
	
}
}