package DesignPatterns.behavioral.commandPattern.concreteCommands;

import DesignPatterns.behavioral.commandPattern.Command;
import DesignPatterns.behavioral.commandPattern.Fan;

public class FanOffCommand implements Command {
    private Fan fan;
    public FanOffCommand(Fan fan) { this.fan = fan; }

    @Override
    public void execute() { fan.off(); }
    @Override
    public void undo() { fan.on(); }
}

