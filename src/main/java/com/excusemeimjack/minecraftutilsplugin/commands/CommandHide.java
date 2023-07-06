package com.excusemeimjack.minecraftutilsplugin.commands;

import com.excusemeimjack.minecraftutilsplugin.MinecraftUtilsPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHide implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private MinecraftUtilsPlugin plugin;
	
	public CommandHide(MinecraftUtilsPlugin plugin)
	{
		this.plugin = plugin;
		plugin.getCommand("hide").setExecutor(this);
	}
	

	@SuppressWarnings("unused")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		Player p = (Player) sender;
		boolean isHidden = p.isSneaking();
		float speed = p.getWalkSpeed();
	
		if(!p.hasPermission("hide.use"))
		{
			if(!p.isSneaking())
			{
				p.setSneaking(true);
				p.setWalkSpeed(speed);
				p.sendMessage("You are now Hidden.");
			}
			else
			{
				p.setSneaking(false);
				p.sendMessage("You are now Shown.");
			}
			return true;
		}
		
		if(p.hasPermission("hide.use"))
		{
			if(!p.isSneaking())
			{
				p.setSneaking(true);
				p.setWalkSpeed(speed);
				p.sendMessage("You are now Hidden.");
			}
			else
			{
				p.setSneaking(false);
				p.sendMessage("You are now Shown.");
			}
			return true;
		}
		return false;
		
		
	}
	public static boolean isHidingWithCommand(Player p)
	{
		boolean sneak;
		if(!p.isSneaking())
		{
			sneak = false;
		}
		else
		{
			sneak = true;
		}
		return sneak;
	}
	

}
