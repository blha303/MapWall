package biz.blha303.MapWall;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;

public class MapWall extends JavaPlugin {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender instanceof Player) {
            sender.sendMessage("[MapWall] Only players can use this command. Console usage is planned.");
            return true;
        }
        Player p = (Player)sender;
        
        return true;
    }

}