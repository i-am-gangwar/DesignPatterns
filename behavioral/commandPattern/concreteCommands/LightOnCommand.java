package DesignPatterns.behavioral.commandPattern.concreteCommands;

import DesignPatterns.behavioral.commandPattern.Command;
import DesignPatterns.behavioral.commandPattern.Light;

// Concrete Commands
public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) { this.light = light; }

    @Override
    public void execute() { light.on(); }
    @Override
    public void undo() { light.off(); }
}
