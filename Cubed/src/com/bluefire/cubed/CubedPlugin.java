package com.bluefire.cubed;

import org.bukkit.plugin.java.JavaPlugin;

import com.bluefire.cubed.managers.Managers;
import com.bluefire.cubed.objects.Manager;

public class CubedPlugin extends JavaPlugin
{

	private String pluginName = "default";
	private double pluginVersion = 1.0;

	private static CubedPlugin instance;
	private Managers managers;

	public CubedPlugin(String pluginName, double pluginVersion)
	{
		setPluginName(pluginName);
		setPluginVersion(pluginVersion);
	}

	@Override
	public void onEnable()
	{
		setInstance(this);
		setManagers(new Managers());
		getManagers().init(this);
	}

	@Override
	public void onDisable()
	{
		for (Manager manager : getManagers().getManagers())
			manager.onUnLoad(this);
	}

	/**
	 * @return Prefix of the Plugin
	 */
	public String getPluginName()
	{
		return pluginName;
	}

	/**
	 * Set the Plugin Name
	 * 
	 * @param pluginName
	 *            Name to be set
	 */
	public void setPluginName(String pluginName)
	{
		this.pluginName = pluginName;
	}

	/**
	 * @return Version of the Plugin
	 */
	public double getPluginVersion()
	{
		return pluginVersion;
	}

	/**
	 * Set the version of the Plugin
	 * 
	 * @param pluginVersion
	 *            Version to be set
	 */
	public void setPluginVersion(double pluginVersion)
	{
		this.pluginVersion = pluginVersion;
	}

	/**
	 * @return Instance of Plugin
	 */
	public static CubedPlugin getInstance()
	{
		return instance;
	}

	/**
	 * Set the instance of the Plugin
	 * 
	 * @param cp
	 *            Instance of the Plugin
	 */
	public static void setInstance(CubedPlugin cp)
	{
		instance = cp;
	}

	public Managers getManagers()
	{
		return managers;
	}

	public void setManagers(Managers managers)
	{
		this.managers = managers;
	}

}
