package com.bluefire.cubed.managers.list;

import java.util.ArrayList;
import java.util.List;

import com.bluefire.cubed.CubedPlugin;
import com.bluefire.cubed.objects.Manager;
import com.bluefire.cubed.objects.Plugin;

public class PluginManager extends Manager
{

	private List<Plugin> plugins = new ArrayList<Plugin>();

	private CubedPlugin cubedPlugin;

	@Override
	public void onLoad(CubedPlugin plugin)
	{
		super.onLoad(plugin);
		setCubedPlugin(plugin);
	}

	public void registerPlugin(Plugin plugin)
	{
		getList().add(plugin);
		plugin.onLoad(getCubedPlugin());
	}

	@Override
	public void onUnLoad(CubedPlugin plugin)
	{
		super.onUnLoad(plugin);
	}

	@Override
	public String getName()
	{
		return "PluginManager";
	}

	@Override
	public double getVersion()
	{
		return 1.0;
	}

	public List<Plugin> getList()
	{
		return plugins;
	}

	public CubedPlugin getCubedPlugin()
	{
		return cubedPlugin;
	}

	public void setCubedPlugin(CubedPlugin cubedPlugin)
	{
		this.cubedPlugin = cubedPlugin;
	}

}
