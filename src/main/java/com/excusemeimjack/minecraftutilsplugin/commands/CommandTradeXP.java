package com.excusemeimjack.minecraftutilsplugin.commands;

import com.excusemeimjack.minecraftutilsplugin.MinecraftUtilsPlugin;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandTradeXP implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private MinecraftUtilsPlugin plugin;
	
	public CommandTradeXP(MinecraftUtilsPlugin plugin)
	{
		this.plugin = plugin;
		plugin.getCommand("trade").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		Player p = (Player) sender;
		
		
		if(!p.hasPermission("trade.use"))
		{ 
			if(args.length == 0)
			{
				p.sendMessage("Please use the command like this: /trade <amountOfDiamonds>");
				return true;
			}
			//trade <amountOfDiamonds> 
			if(args.length == 1)
			{
				int amountOfDiamonds = Integer.valueOf(args[0]);
				ItemStack diamonds = new ItemStack(Material.DIAMOND, amountOfDiamonds);
				p.giveExpLevels(amountOfDiamonds);
				
				p.getInventory().remove(diamonds);
				return true;
				
			}
			if(args.length > 1)
			{
				p.sendMessage("Please use the command like this: /trade <amountOfDiamonds>");
				return true;
			}
		}
		
		if(p.hasPermission("trade.use"))
		{
			if(args.length == 0)
			{
				p.sendMessage("Please use the command like this: /trade <amountOfDiamonds>");
				return true;
			}
			//trade <amountOfDiamonds> 
			if(args.length == 1)
			{
				int amountOfDiamonds = Integer.valueOf(args[0]);
				ItemStack diamonds = new ItemStack(Material.DIAMOND, amountOfDiamonds);
				p.giveExpLevels(amountOfDiamonds);
				
				p.getInventory().remove(diamonds);
				return true;
				
			}
			if(args.length > 1)
			{
				p.sendMessage("Please use the command like this: /trade <amountOfDiamonds>");
				return true;
			}
		}
		
		return true;
	}

}
