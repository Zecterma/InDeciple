package me.Zecterma.InDeciple;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class InDecipleCommand implements CommandExecutor {

	
	public InDecipleCommand(InDeciple inDeciple) {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
    {
      if ((sender instanceof Player)) {
        Player player = (Player)sender;
        if ((commandLabel.equalsIgnoreCase("Idc")) || (commandLabel.equalsIgnoreCase("Idc"))) {
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
    }
}
