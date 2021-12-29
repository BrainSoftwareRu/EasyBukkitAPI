package ru.brainsoft.easybukkit;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Console extends JavaPlugin {
		
	
	public static void Info(String msg) {
		Logger log = Logger.getLogger(msg);
		log.info(msg);
	}
	public static void Error(String msg) {
		Logger log = Logger.getLogger(msg);
		log.severe(msg);
	}
	public static void Warning(String msg) {
		Logger log = Logger.getLogger(msg);
		log.warning(msg);
	}
}
