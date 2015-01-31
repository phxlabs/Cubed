package example.bluefire.test;

import com.bluefire.cubed.CubedPlugin;
import com.bluefire.cubed.managers.list.PluginManager;

public class TestPlugin extends CubedPlugin
{

	public TestPlugin()
	{
		super("Test", 1.0);
	}

	@Override
	public void onEnable()
	{
		super.onEnable(); // must include
		/**
		 * Add a new manager and load it. Adding the TestManager
		 */
		addManager(new TestManager());
		/**
		 * Register the JoinMessage Plugin
		 */
		((PluginManager) getManagers().getManagerByClass(PluginManager.class)).registerPlugin(new JoinMessagePlugin());
	}

	@Override
	public void onDisable()
	{
		super.onDisable(); // must include
	}

}
