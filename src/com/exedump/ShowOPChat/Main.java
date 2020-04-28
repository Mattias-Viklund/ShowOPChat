package com.exedump.ShowOPChat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static boolean showChat = true;

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new OPChatListener(), this);
	}

	@Override
	public void onDisable() {

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {	
		if (command.getName().equalsIgnoreCase("showopchat")) {
			showChat = !showChat;
			if (showChat)
				getServer().broadcastMessage("Showing OP messages.");
			else
				getServer().broadcastMessage("Not showing OP messages.");

		}
		return true;
	}
}
