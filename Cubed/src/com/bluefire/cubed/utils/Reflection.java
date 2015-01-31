package com.bluefire.cubed.utils;

import com.bluefire.cubed.objects.Manager;

public class Reflection
{

	public static Manager instanceFromClass(Class<? extends Manager> c)
	{
		try
		{
			return (Manager) c.newInstance();
		} catch (InstantiationException e)
		{
			Logging.error(e.getMessage());
		} catch (IllegalAccessException e)
		{
			Logging.error(e.getMessage());
		}
		return null;
	}

}
