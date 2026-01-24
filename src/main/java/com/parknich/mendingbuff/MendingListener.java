package com.parknich.mendingbuff;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemMendEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MendingListener implements Listener {

    private final JavaPlugin plugin;

    public MendingListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onItemMend(PlayerItemMendEvent event) {
        double multiplier = plugin.getConfig().getDouble("mending-multiplier", 2.0);
        if (multiplier <= 1.0) return;

        int original = event.getRepairAmount();
        int boosted = (int) Math.round(original * multiplier);

        event.setRepairAmount(boosted);
    }
}
