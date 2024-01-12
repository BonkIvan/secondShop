package by.bonk.secondShop.controller.command.provider;

import by.bonk.secondShop.controller.command.Command;
import by.bonk.secondShop.controller.command.CommandKey;

import java.util.HashMap;

public class CommandProvider {
    
    //Мапа, где будет лежать наши команды
    private final HashMap<CommandKey, Command> commands = new HashMap<>();
    
    //Объект, в случаи если нет команды на запрос
  //  private static final Command DEFAULT_COMMAND = new NotFoundCommand();
    
    
}
