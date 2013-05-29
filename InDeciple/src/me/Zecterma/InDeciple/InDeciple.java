package me.Zecterma.InDeciple;

import me.Zecterma.InDeciple.Commands.InDecipleCommand;
import me.Zecterma.InDeciple.Commands.InDecipleGCommand;
import me.Zecterma.InDeciple.Commands.InDecipleListCommand;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class InDeciple extends JavaPlugin {
	public Economy economy = null;


	@Override
    public void onEnable(){
		this.setupEconomy();
		System.out.println("Starting InDeciple...");
		
		getCommand("indeciple").setExecutor(new InDecipleCommand(this));
		getCommand("idcl").setExecutor(new InDecipleListCommand(this));
		getCommand("gmmode").setExecutor(new InDecipleGCommand(this));


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