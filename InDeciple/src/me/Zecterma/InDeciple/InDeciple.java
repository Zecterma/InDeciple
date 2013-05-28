package me.Zecterma.InDeciple;

import me.Zecterma.InDeciple.Commands.InDecipleCommand;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class InDeciple extends JavaPlugin {
	public static Economy economy = null;


	@Override
    public void onEnable(){
		this.setupEconomy();
		System.out.println("Starting InDeciple...");
		
		getCommand("indeciple").setExecutor(new InDecipleCommand(this));
		

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