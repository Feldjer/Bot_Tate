package com.company.telegram.commands;

import com.company.module.Visualizer;

public class GameInstruction extends Command {
    @Override
    public String execute() {
        return Visualizer.getHowPlay();
    }
}