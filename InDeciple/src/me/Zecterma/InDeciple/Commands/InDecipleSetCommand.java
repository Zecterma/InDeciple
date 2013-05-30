package me.Zecterma.InDeciple.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import me.Zecterma.InDeciple.InDeciple;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class InDecipleSetCommand implements CommandExecutor {
    
//	private InDeciple plugin; // pointer to your main class, unrequired if you don't need methods from the main class

	public InDecipleSetCommand(InDeciple plugin) {
//	this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("set")){
			Player player = (Player) sender;
			PlayerInventory inventory = ((HumanEntity) player).getInventory();
			
            ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE, 1);
            ItemStack wand = new ItemStack(Material.WOOD_AXE, 1);
            ItemStack redstone = new ItemStack(Material.REDSTONE, 64);
            ItemStack redstonerepeater = new ItemStack(Material.DIODE, 64);
            ItemStack stickypiston = new ItemStack(Material.PISTON_STICKY_BASE, 64);
            ItemStack redstonetorch = new ItemStack(Material.REDSTONE_TORCH_ON, 64);
            ItemStack lever = new ItemStack(Material.LEVER, 64);
            ItemStack button = new ItemStack(Material.WOOD_BUTTON, 64);
            
            
			if(args.length == 1){
				if (sender.hasPermission("indeciple.set")) {
					if (args[0].equalsIgnoreCase("redstone")) {
						inventory.clear();
	                    
						
						inventory.addItem(pickaxe);
						inventory.addItem(wand);
						inventory.addItem(redstone);
						inventory.addItem(redstonerepeater);
						inventory.addItem(stickypiston);
						inventory.addItem(redstonetorch);
						inventory.addItem(lever);
						inventory.addItem(button);

	                    sender.sendMessage(ChatColor.DARK_GREEN + "You got your set!");
						} else {
							sender.sendMessage(ChatColor.DARK_RED + "The correct usage is " + ChatColor.DARK_PURPLE + "/set <item set>");
						}
					} else {
						sender.sendMessage(ChatColor.DARK_RED + "You don't have permissions for this command!");
					}
				} else if (args.length != 1){
					sender.sendMessage(ChatColor.DARK_RED + "Incorrect amount of arguments! The correct usage is " + ChatColor.DARK_PURPLE + "/set <item set>");
			} 
		}
	
	
	
	
	return false;
	}
	
}