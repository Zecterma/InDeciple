package me.Zecterma.InDeciple;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class InDecipleCommand {


	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
    {
      if ((sender instanceof Player)) {
        if ((commandLabel.equalsIgnoreCase("Idc")) || (commandLabel.equalsIgnoreCase("Idc"))) {
          if (args.length > 0)
          {
        	  
        	  
              if (args[0].equalsIgnoreCase("indeciple")) {
                  if (((sender.isOp()) || (sender.hasPermission("InDeciple.InDeciple"))) && (args.length == 1)) {
                sender.sendMessage("Welcome to InDeciple.");
                    }
                }
              
              
              
              
              
              
                return true;
        }}}
	return false;
    }
}
