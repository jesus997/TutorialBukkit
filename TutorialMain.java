package me.jesus997;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Tutorial de ejemplo para crear un plugin bukkit
 * @author jesus997
 */

public class TutorialMain extends JavaPlugin{
    @Override
    public void onEnable(){
        getLogger().info("Plugin activado correctamente");
    }
    @Override
    public void onDisable(){
        getLogger().info("Plugin desactivado correctamente");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args){
        if(cmd.getName().equalsIgnoreCase("food")){
            if(sender instanceof Player){
                Player p = (Player) sender;
                p.setHealth(p.getMaxHealth());
                p.sendMessage("Te has regenerado la vida correctamente.");
            }else{
                sender.sendMessage("Este comando es solo para jugadores");
            }
        }
        return false;
    }
}
