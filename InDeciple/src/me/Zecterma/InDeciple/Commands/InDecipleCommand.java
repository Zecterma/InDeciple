package me.Zecterma.InDeciple.Commands;


import org.bukkit.command.Command;
import me.Zecterma.InDeciple.InDeciple;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InDecipleCommand implements CommandExecutor {
    
	private InDeciple plugin; // pointer to your main class, unrequited if you don't need methods from the main class
 
	public InDecipleCommand(InDeciple plugin) {
		this.plugin = plugin;
	}
 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
	      if ((sender instanceof Player)) {
	        if ((label.equalsIgnoreCase("Idc")) || (label.equalsIgnoreCase("Idc"))) {
	          if (args.length > 0)
	          {
	        	  
	        	  
	              if (args[0].equalsIgnoreCase("indeciple")) {
	                  if (((sender.isOp()) || (sender.hasPermission("InDeciple.InDeciple"))) && (args.length == 1)) {
	                sender.sendMessage("Welcome to InDeciple.");
	                    }
	                }
	              
	              
	              
	              
	              
	              
	                return true;
	        }
}
	      }
		return false;
		}}

