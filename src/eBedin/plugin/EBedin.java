package eBedin.plugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EBedin extends JavaPlugin implements Listener{

	String name = null;
	Player player = null;

	@Override
	public void onDisable() {
		getLogger().info("�v���O�C������~���܂���");
	}

	@Override
	public void onEnable() {
		getLogger().info("�v���O�C�����ǂݍ��܂�܂���");
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void inbed(PlayerBedEnterEvent e) {
		name = e.getPlayer().getName();

		Bukkit.broadcastMessage(name + "���񂪐Q�܂���");
	}
}
