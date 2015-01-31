package com.bluefire.cubed.objects;

import com.bluefire.cubed.CubedPlugin;
import com.bluefire.cubed.utils.Logging;

public class Plugin
{

	private String pluginName = "default";
	private double pluginVersion = 0.0;

	public Plugin(String pluginName, double pluginVersion)
	{
		setPluginName(pluginName);
		setPluginVersion(pluginVersion);
	}

	public void onLoad(CubedPlugin plugin)
	{
		Logging.log(getPluginName() + "(" + getPluginVersion() + ") plugin loaded");
	}

	public void onUnLoad(CubedPlugin plugin)
	{
		Logging.info(getPluginName() + "(" + getPluginVersion() + ") plugin unloaded");
	}

	public String getPluginName()
	{
		return pluginName;
	}

	public void setPluginName(String pluginName)
	{
		this.pluginName = pluginName;
	}

	public double getPluginVersion()
	{
		return pluginVersion;
	}

	public void setPluginVersion(double pluginVersion)
	{
		this.pluginVersion = pluginVersion;
	}

}
