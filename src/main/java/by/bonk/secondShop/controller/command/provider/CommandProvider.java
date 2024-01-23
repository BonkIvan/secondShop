package by.bonk.secondShop.controller.command.provider;

import by.bonk.secondShop.controller.command.Command;
import by.bonk.secondShop.controller.command.CommandKey;
import by.bonk.secondShop.controller.command.implement.AdminOrdersCommand;
import by.bonk.secondShop.controller.command.implement.AnonymousCartCommand;
import by.bonk.secondShop.controller.command.implement.NotFoundCommand;
import by.bonk.secondShop.controller.command.implement.UserCartCommand;

import java.util.HashMap;

public class CommandProvider {
    
    //Мапа, где будет лежать наши команды
    private final HashMap<CommandKey, Command> commands = new HashMap<>();

    private static final Command DEFAULT_COMMAND = new NotFoundCommand();

    public CommandProvider() {
        // создаём команды и кладём их в hashmap
        CommandKey adminOrdersKey = new CommandKey("orders", "ADMIN", "GET");
        commands.put(adminOrdersKey, new AdminOrdersCommand());

        // создаём команды и кладём их в hashmap
        CommandKey anonymousCartKey = new CommandKey("cart", null, "GET");
        commands.put(anonymousCartKey, new AnonymousCartCommand());

        CommandKey userCartKey = new CommandKey("cart", "USER", "GET");
        commands.put(userCartKey, new UserCartCommand());

//        CommandKey userCartKey = new CommandKey("cart", "USER", "POST");
//        commands.put(userCartKey, new AddToUserCart());

        // другие команды
    }

    public Command getCommand(String role, String page, String method) {
        CommandKey key = new CommandKey(page, role, method);
        Command command = commands.get(key);

        if (command != null) return command;

        return DEFAULT_COMMAND;
    }
    
    
}
