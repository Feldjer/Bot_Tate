package com.company.telegram.commands;

import com.company.module.Visualizer;

public class MenuInformation extends Command {
    @Override
    public String execute() {
        return Visualizer.getInformation();
    }
}
