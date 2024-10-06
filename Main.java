package org.cmptrwhz.main;

import com.willfp.ecobits.EcoBitsPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    FileConfiguration config = this.getConfig();
    private static Main instance;
    private EcoBitsPlugin ecoBitsPlugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveDefaultConfig();
        instance = this;
        ecoBitsPlugin = EcoBitsPlugin.getInstance();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public EcoBitsPlugin getEcoBitsPlugin(){
        return ecoBitsPlugin;
    }

    public static Main getInstance() {
        return instance;
    }

    public String getStringConfigValue(String path) {
            return this.getConfig().getString(path);
        }
}
