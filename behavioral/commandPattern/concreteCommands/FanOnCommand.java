package DesignPatterns.behavioral.commandPattern.concreteCommands;

import DesignPatterns.behavioral.commandPattern.Command;
import DesignPatterns.behavioral.commandPattern.Fan;

public class FanOnCommand implements Command {
    private Fan fan;
    public FanOnCommand(Fan fan) { this.fan = fan; }

    @Override
    public void execute() { fan.on(); }
    @Override
    public void undo() { fan.off(); }
}
