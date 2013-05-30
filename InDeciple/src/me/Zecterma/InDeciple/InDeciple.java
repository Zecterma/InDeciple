package me.Zecterma.InDeciple;

import java.io.File;

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
		
		File file = new File(getDataFolder() + File.separator + "config.yml");
		
		if (!file.exists()){
			this.getLogger().info("Generating config.yml...");
			
			this.getConfig().addDefault("message", "This is my message!");
			this.getConfig().options().copyDefaults(true);
			this.saveConfig();
		}
		
		
		
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