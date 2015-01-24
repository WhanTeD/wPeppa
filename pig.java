package peppa;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class pig extends JavaPlugin implements Listener {

public void onEnable() {
		
		ConsoleCommandSender msg = Bukkit.getConsoleSender();
		msg.sendMessage("§f[§dPeppa§f] - Plugin §aLigado");
		
	}
	
	public void onDisable() {
		
		ConsoleCommandSender msg = Bukkit.getConsoleSender();
		msg.sendMessage("§f[§dPeppa§f] - Plugin §4Desligado");
		
	}
    
	public boolean onCommand(CommandSender enviador, Command comando, String Commandlabel,
			String[] args) {
		
		if(comando.getName().equalsIgnoreCase("oinc")){
		Player jogador = (Player) enviador;
		if(jogador.hasPermission("peppa.oinc")) {
			jogador.sendMessage("§dPeppa§f: peppppaaa piguiiii tnananaananan tututnununumm pepppppap piguiii");
			
		}else{
			jogador.sendMessage("§4Você não tem permissão para fazer isso");
			}
	
		}
		return false;
	}
}
