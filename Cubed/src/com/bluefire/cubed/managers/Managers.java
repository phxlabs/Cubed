package com.bluefire.cubed.managers;

import java.util.ArrayList;
import java.util.List;

import com.bluefire.cubed.CubedPlugin;
import com.bluefire.cubed.managers.list.PluginManager;
import com.bluefire.cubed.objects.Manager;
import com.bluefire.cubed.utils.Reflection;

public class Managers
{

	private List<Manager> managers = new ArrayList<Manager>();

	public void init(CubedPlugin plugin)
	{
		addManager(Reflection.instanceFromClass(PluginManager.class));
	}

	/**
	 * Get Manager instance from class of Manager
	 * 
	 * @param c
	 *            Class of Manager
	 * @return Manager instance
	 */
	public Manager getManagerByClass(Class<? extends Manager> c)
	{
		for (Manager manager : getManagers())
			if (manager.getClass() == c)
				return manager;
		return null;
	}

	public void addManager(Manager manager)
	{
		getManagers().add(manager);
	}

	public List<Manager> getManagers()
	{
		return managers;
	}

	public void setManagers(List<Manager> managers)
	{
		this.managers = managers;
	}

}
