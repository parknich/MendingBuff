package com.parknich.mendingbuff;

import org.bukkit.plugin.java.JavaPlugin;

public final class MendingBuff extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new MendingListener(this), this);
        getLogger().info("MendingBuff enabled. Multiplier = " + getConfig().getDouble("mending-multiplier", 2.0));
    }

    @Override
    public void onDisable() {
        getLogger().info("MendingBuff disabled.");
    }
}
