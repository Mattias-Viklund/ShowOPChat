package com.exedump.ShowOPChat;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import net.md_5.bungee.api.ChatColor;

public class OPChatListener implements Listener {
	@EventHandler
	public void onPreCommand(PlayerCommandPreprocessEvent e) {
		if (Main.showChat && e.getPlayer().isOp() && e.getMessage().charAt(0) == '/') {
			Bukkit.getServer().broadcastMessage(ChatColor.DARK_GREEN + e.getPlayer().getName() + ChatColor.RESET
					+ " issued command: " + ChatColor.RED + "'" + e.getMessage() + "'" + ChatColor.RESET);
			
		}
	}
}
