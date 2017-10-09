package me.ryotackey.dice;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class DicePlugin extends JavaPlugin implements CommandExecutor{

    @Override
    public void onEnable(){
        getCommand("rdice").setExecutor(this);
    }

    @Override
    public  boolean  onCommand(CommandSender sender, Command command, String label, String[] args){
        if (!(sender instanceof Player)) return false;
        Player player = (Player)sender;

        Random rnd = new Random();
        int ran = rnd.nextInt(Integer.parseInt(args[0])) + 1;
        player.sendMessage( ChatColor.BLUE + "[" + ChatColor.YELLOW + "Dice" + ChatColor.BLUE + "]" + ChatColor.AQUA + player.getPlayer().getName() + ChatColor.WHITE + "は" + ChatColor.DARK_AQUA + args[0] + ChatColor.WHITE + "面サイコロを振り" + ChatColor.RED + ran + ChatColor.WHITE + "が出た");
        return true;
    }

    @Override
    public void onDisable(){

    }
}
