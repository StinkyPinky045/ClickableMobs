package org.mineacademy.template;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;


/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class ClickableMobs extends SimplePlugin {

	/**
	 * 1 Second is 20 ticks in game (minecraft heartbeat)
	 */
	private int seconds = 20;

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {

		System.out.println("!!Do not click Mobs!!");
		//prints that StinkyPinky made this in console
	}


	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An event that checks if the right clicked entity is Glowing, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {

		if (event.getRightClicked().isGlowing())
			event.getRightClicked().setFireTicks(60);
		else {
			event.getRightClicked().setGlowing(true);
		}
	}
}