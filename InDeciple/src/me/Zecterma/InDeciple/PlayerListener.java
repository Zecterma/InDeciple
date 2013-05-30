package me.Zecterma.InDeciple;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener {

	public InDeciple plugin;
	
	public PlayerListener(InDeciple instance){
		plugin = instance;
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
		if (plugin.hashmap.containsKey(event.getPlayer())){
			event.getPlayer().teleport(event.getPlayer());
			event.getPlayer().sendMessage(ChatColor.DARK_GREEN + "You are forzen!");
		}
	}
	
}
