package me.Zecterma.InDeciple.Commands;


import net.milkbowl.vault.economy.Economy;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import me.Zecterma.InDeciple.InDeciple;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InDecipleCommand implements CommandExecutor {
    
	private Economy econ;
	
	public InDecipleCommand(InDeciple indeciple) {
		this.econ = indeciple.economy;
	}
	
	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		if (cs instanceof Player) {
			if(args.length != 0) {
				cs.sendMessage(ChatColor.DARK_RED + "Wrong number of parameters");
				return true;
			}
			//try {
				//id = Integer.valueOf(args[0]);
				//amount = Integer.valueOf(args[1]);
				
			//} catch (NumberFormatException mfe) {
				//cs.sendMessage("You gotta give a number");
				//return true;
			//}
			
			if (label.equalsIgnoreCase("indeciple")){
				cs.sendMessage(ChatColor.DARK_GREEN + "Welcome to InDeciple");
						
					} else {
						cs.sendMessage(ChatColor.DARK_RED + "Something went wrong.");
						return true;
					}
					
				}

		return true;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private InDeciple plugin; // pointer to your main class, unrequited if you don't need methods from the main class
 
//	public InDecipleCommand(InDeciple plugin) {
//		this.plugin = plugin;
//	}
 
//	@Override
//	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	//	{
	//	      if (sender instanceof Player) {
	//	        if (label.equalsIgnoreCase("idc")) {
	//	          if (args.length > 0)
	//	          {
	//	        	  
	//	        	  
	//	              if (args[0].equalsIgnoreCase("indeciple")) {
	//                if (((sender.isOp()) || (sender.hasPermission("InDeciple.InDeciple"))) && (args.length == 1)) {
	//              sender.sendMessage("Welcome to InDeciple.");
	//                  }
	//              }
	              
	              
	              
	              
	              
	              
	//              return true;
	//      }
	//}
	//    }
	//return false;
	//}}

