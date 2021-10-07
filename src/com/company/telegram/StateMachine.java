package com.company.telegram;

import com.company.module.User;
import com.company.telegram.commands.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для реализации програмной логики команд.
 */
public class StateMachine {

    /**
     * HashMap комманд.
     */
    static Map<String, ICommand> menuCommand = new HashMap<>();


    static {
        menuCommand.put("/addBank", new GameAddBank());
        menuCommand.put("/getBank", new GameGetBank());
        menuCommand.put("/startGame", new GameStartGame());
        menuCommand.put("/exit", new GameExit());
        menuCommand.put("/instrumentation", new GameInstruction());
        menuCommand.put("/play", new GamePlay());
        menuCommand.put("/information", new MenuInformation());
        menuCommand.put("/help", new MenuHelp());
        menuCommand.put("/start", new MenuStart());
    }

    /**
     * Метод для выполнения команд меню.
     *
     * @param command Текст,введенный пользователем.
     * @return Ответ пользователю.
     */
    public String doCommand(String command, User user) {

        try {
            ICommand iCommand = menuCommand.get(command);
            if (user.getGameCode() != 0 && !command.equals("/exit")) {
                return new GameStartGame().execute(command, user);
            }
            return iCommand.execute(command, user);
        } catch (Exception exception) {
            return "Не понял команду!";
        }
    }
}
