package me.Zecterma.InDeciple.Commands;



import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import me.Zecterma.InDeciple.InDeciple;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InDecipleGCommand implements CommandExecutor {
	public InDecipleGCommand(InDeciple gmmode) {
	}
	
	
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		readCommand((Player) cs, label);
		
		return false;
	}
		public void readCommand(Player player, String command) {
			if(command.equalsIgnoreCase("g")) {
					player.setGameMode(GameMode.CREATIVE);
					player.sendMessage(ChatColor.DARK_GREEN + "Now in" + ChatColor.GOLD + "creative" + ChatColor.DARK_GREEN + " mode.");
				} else if (command.equalsIgnoreCase("s")) {
					player.setGameMode(GameMode.SURVIVAL);
					player.sendMessage(ChatColor.DARK_GREEN + "Now in" + ChatColor.GOLD + "survival" + ChatColor.DARK_GREEN + " mode.");
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
//	{	
	//	if (cs instanceof Player) {
			//			if(args.length != 0) {
	//			cs.sendMessage(ChatColor.DARK_RED + "Wrong number of parameters");
	//			return true;
				//		}
//		
	//		Player player = (Player) cs;
			
	//	
	//	if (label.equalsIgnoreCase("g")) {
	//			player.setGameMode(GameMode.CREATIVE);
					//			cs.sendMessage(ChatColor.DARK_GREEN + "Now in" + ChatColor.GOLD + "creative" + ChatColor.DARK_GREEN + "mode.");
				
	//	} else if (label.equalsIgnoreCase("s")) {
	//			player.setGameMode(GameMode.SURVIVAL);
	//			cs.sendMessage(ChatColor.DARK_GREEN + "Now in" + ChatColor.GOLD + "survival" + ChatColor.DARK_GREEN + "mode.");
					//
	//		}
				
	//	} else {
	//				cs.sendMessage(ChatColor.DARK_RED + "Something went wrong.");
	//			return true;
						//			}
					
				

		
		
	//
	//return true;
	
	
	//}

	//}
