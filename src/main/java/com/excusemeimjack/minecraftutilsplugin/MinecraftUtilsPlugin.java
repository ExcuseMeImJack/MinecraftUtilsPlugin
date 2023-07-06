package com.excusemeimjack.minecraftutilsplugin;

import com.excusemeimjack.minecraftutilsplugin.commands.CommandTradeXP;
import com.excusemeimjack.minecraftutilsplugin.commands.CommandHide;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftUtilsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        new CommandTradeXP(this);
        new CommandHide(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
