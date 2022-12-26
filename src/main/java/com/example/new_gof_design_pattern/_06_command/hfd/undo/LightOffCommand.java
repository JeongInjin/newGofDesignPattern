package com.example.new_gof_design_pattern._06_command.hfd.undo;

public class LightOffCommand implements Command{

    Light light;
    int level;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
