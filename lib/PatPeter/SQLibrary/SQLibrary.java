/*
 * Date Created: 2012-03-11 14:20
 * @author <a href="http://forums.bukkit.org/members/jertocvil.18552/">jertocvil</a>
 * @author roblabla
 */
package lib.PatPeter.SQLibrary;
 
import java.util.logging.Level;
import java.util.logging.Logger;
 
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.ProxyServer;

/**
 * Class for running the library as a plugin.<br>
 * Date Created: 2012-03-11 14:20.
 * 
 * @author Nicholas Solin, a.k.a. PatPeter
 * @author Robin Lambertz, a.k.a. Roblabla
 */
public class SQLibrary extends Plugin {
	/**
	 * Logger for the Minecraft server.
	 */
	public static final Logger logger = ProxyServer.getInstance().getLogger();
	
	/**
	 * onEnable() method for the plugin.
	 */
	public void onEnable() {
	    SQLibrary.logger.log(Level.INFO, "[SQLibrary] SQLibrary loaded.");
	}
	
	/**
	 * onDisable method for the plugin.
	 */
	public void onDisable() {
	    SQLibrary.logger.log(Level.INFO, "[SQLibrary] SQLibrary stopped.");
	}
} 
