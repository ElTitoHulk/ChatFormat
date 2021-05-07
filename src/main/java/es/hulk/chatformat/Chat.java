package es.hulk.chatformat;

import es.hulk.chatformat.commands.ChatFormatCommand;
import es.hulk.chatformat.commands.ChatFormatReloadCommand;
import es.hulk.chatformat.utils.FileConfig;
import es.hulk.chatformat.utils.command.CommandManager;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

@Getter @Setter
public class Chat extends JavaPlugin {

    private FileConfig mainConfig;
    private CommandManager commandManager;

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        registerConfigs();
        registerCommand();
        registerListeners();
    }

    public void registerConfigs() {
        mainConfig = new FileConfig(this, "config.yml");
    }

    public void registerCommand() {
        new ChatFormatCommand();
        new ChatFormatReloadCommand();
    }

    public void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
        commandManager = new CommandManager(this);
    }

    public static Chat get() {
        return getPlugin(Chat.class);
    }
}
