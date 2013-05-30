package me.Zecterma.InDeciple;

import java.io.File;

import me.Zecterma.InDeciple.Commands.InDecipleCommand;
import me.Zecterma.InDeciple.Commands.InDecipleGCommand;
import me.Zecterma.InDeciple.Commands.InDecipleListCommand;
import net.milkbowl.vault.economy.Economy;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class InDeciple extends JavaPlugin {
	public Economy economy = null;


	@Override
    public void onEnable(){
	    final FileConfiguration config = this.getConfig();
		File file = new File(getDataFolder() + File.separator + "config.yml");
		
		if (!file.exists()){
			this.getLogger().info("Generating config.yml...");
			
			config.addDefault("Welcome Message", "Welcome to InDeciple!");
			config.options().copyDefaults(true);
			saveConfig();
		}
		
		
		
		this.setupEconomy();
		System.out.println("Starting InDeciple...");
		
		getCommand("indeciplelist").setExecutor(new InDecipleListCommand(this));
		getCommand("g").setExecutor(new InDecipleGCommand(this));
		getCommand("indeciple").setExecutor(new InDecipleCommand(this));


	}
 
    @Override
    public void onDisable() {
    	System.out.println("InDeciple stopped.");
    }
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("indeciplereload")){
			if(sender.hasPermission("indeciple.reload")){
			this.reloadConfig();
			sender.sendMessage(ChatColor.DARK_GREEN + "Configuration reloaded!");
			} else {
				sender.sendMessage("You don't have permissions for this command.");
			}
		}
		
		return false;
		
	}
    private boolean setupEconomy() {
        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            economy = economyProvider.getProvider();
        }

        return (economy != null);
    }
	
}