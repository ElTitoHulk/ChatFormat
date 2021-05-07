package es.hulk.chatformat.commands;

import es.hulk.chatformat.Chat;
import es.hulk.chatformat.utils.FileConfig;
import es.hulk.chatformat.utils.command.BaseCommand;
import es.hulk.chatformat.utils.command.Command;
import es.hulk.chatformat.utils.command.CommandArgs;

public class ChatFormatReloadCommand extends BaseCommand {

    private FileConfig mainConfig = Chat.get().getMainConfig();

    @Command(name = "chatformat", permission = "hulk.command.chatformat")

    @Override
    public void onCommand(CommandArgs command) {
        mainConfig.reload();
    }
}
