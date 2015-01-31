package example.bluefire.test;

import com.bluefire.cubed.CubedPlugin;
import com.bluefire.cubed.objects.Manager;

public class TestManager extends Manager
{

	@Override
	public void onLoad(CubedPlugin plugin)
	{
		super.onLoad(plugin);
	}

	@Override
	public String getName()
	{
		return "test";
	}

	@Override
	public double getVersion()
	{
		return 1.0;
	}

}
