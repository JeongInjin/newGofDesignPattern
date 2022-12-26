package com.example.new_gof_design_pattern._06_command.hfd.undo;

public class LightOnCommand implements Command {
    Light light;
    int level;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
