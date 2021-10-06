package com.company.telegram.commands;

import com.company.module.User;
import com.company.module.Visualizer;

/**
 * Класс реализации программной логики команды /play.
 */
public class GamePlay extends Command {

    /**
     * Метод реализации програмной логики команды /play.
     *
     * @param data Текст,введнный пользователем.
     * @param user Пользователь.
     * @return Привестсвтие и правила к игре.
     */
    @Override
    public String execute(String data, User user) {
        return Visualizer.getInstructionGreeting();
    }
}
