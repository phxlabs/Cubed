package example.bluefire.test;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.bluefire.cubed.CubedPlugin;
import com.bluefire.cubed.objects.Plugin;

public class JoinMessagePlugin extends Plugin implements Listener
{

	/**
	 * "implements Listener" is required for the Bukkit events to work in this
	 * class
	 */

	public JoinMessagePlugin()
	{
		super("Join Message", 1.1);
	}

	@Override
	public void onLoad(CubedPlugin plugin)
	{
		super.onLoad(plugin); // must include
		/**
		 * Register the methods within this class for events
		 */
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler()
	public void onPlayerJoinEvent(PlayerJoinEvent event)
	{
		event.setJoinMessage(ChatColor.GREEN + event.getPlayer().getDisplayName() + " has joined");
	}

	@EventHandler()
	public void onPlayerQuitEvent(PlayerQuitEvent event)
	{
		event.setQuitMessage(ChatColor.RED + event.getPlayer().getDisplayName() + " has quit");
	}

}
