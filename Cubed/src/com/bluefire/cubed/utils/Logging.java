package com.bluefire.cubed.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.ChatColor;

import com.bluefire.cubed.CubedPlugin;

public class Logging
{

	public static void log(String output)
	{
		output = ChatColor.GREEN + "[" + CubedPlugin.getInstance().getPluginName() + "] " + ChatColor.RESET + output;
		getLogger().log(Level.ALL, output);
	}

	public static void info(String output)
	{
		output = ChatColor.GREEN + "[" + CubedPlugin.getInstance().getPluginName() + "] " + ChatColor.AQUA + output;
		getLogger().log(Level.ALL, output);
	}

	public static void error(String output)
	{
		output = ChatColor.RED + "[ERROR]-[" + CubedPlugin.getInstance().getPluginName() + "] " + ChatColor.RESET + output;
		getLogger().log(Level.ALL, output);
	}

	private static Logger getLogger()
	{
		return CubedPlugin.getInstance().getLogger();
	}

}
