package es.hulk.chatformat.commands;

import es.hulk.chatformat.utils.CC;
import es.hulk.chatformat.utils.command.BaseCommand;
import es.hulk.chatformat.utils.command.Command;
import es.hulk.chatformat.utils.command.CommandArgs;
import org.bukkit.command.CommandSender;

public class ChatFormatCommand extends BaseCommand {

    @Command(name = "chatformat", permission = "hulk.command.chatformat")

    @Override
    public void onCommand(CommandArgs command) {
        CommandSender sender = command.getSender();

        CC.sender(sender, "&cUsage: /chatformat reload");
    }
}
