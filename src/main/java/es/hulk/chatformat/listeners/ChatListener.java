package es.hulk.chatformat.listeners;

import es.hulk.chatformat.Chat;
import es.hulk.chatformat.utils.FileConfig;
import es.hulk.chatformat.utils.Utils;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    private FileConfig mainConfig = Chat.get().getMainConfig();

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        if (mainConfig.getBoolean("CHAT.ENABLED")) {
            event.setFormat(Utils.color(PlaceholderAPI.setPlaceholders(player, mainConfig.getString("CHAT.FORMAT")
                    .replaceAll("%player%", player.getDisplayName())
                    .replace("%message%", "%2$s"))));
        }
    }

}
