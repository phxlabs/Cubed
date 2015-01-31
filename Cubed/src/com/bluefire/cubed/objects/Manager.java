package com.bluefire.cubed.objects;

import com.bluefire.cubed.CubedPlugin;
import com.bluefire.cubed.utils.Logging;

public abstract class Manager
{

	public void onLoad(CubedPlugin plugin)
	{
		Logging.log(getName() + "(" + getVersion() + ") manager loaded");
	}

	public void onUnLoad(CubedPlugin plugin)
	{
		Logging.info(getName() + "(" + getVersion() + ") manager unloaded");
	}

	public abstract String getName();

	public abstract double getVersion();

}
