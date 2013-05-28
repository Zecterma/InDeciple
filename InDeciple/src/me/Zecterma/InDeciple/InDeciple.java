package me.Zecterma.InDeciple;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class InDeciple extends JavaPlugin {
	public static Economy economy = null;
	private int messageTask;

	@Override
    public void onEnable(){
		this.setupEconomy();
		System.out.println("Starting InDeciple...");
		
		this.getCommand("indeciple").setExecutor(new InDecipleCommand(this));
		
		
	PluginManager pm = this.getServer().getPluginManager();
	
	}
 
    @Override
    public void onDisable() {
    	System.out.println("InDeciple stopped.");
    }
	
    private boolean setupEconomy() {
        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            economy = economyProvider.getProvider();
        }

        return (economy != null);
    }
	
}