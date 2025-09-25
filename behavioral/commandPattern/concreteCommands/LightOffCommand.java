package DesignPatterns.behavioral.commandPattern.concreteCommands;

import DesignPatterns.behavioral.commandPattern.Command;
import DesignPatterns.behavioral.commandPattern.Light;

public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) { this.light = light; }

    @Override
    public void execute() { light.off(); }
    @Override
    public void undo() { light.on(); }
}
