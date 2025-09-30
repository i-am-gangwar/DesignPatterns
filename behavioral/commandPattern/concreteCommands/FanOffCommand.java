package behavioral.commandPattern.concreteCommands;

import behavioral.commandPattern.Command;
import behavioral.commandPattern.Fan;

public class FanOffCommand implements Command {
    private Fan fan;
    public FanOffCommand(Fan fan) { this.fan = fan; }

    @Override
    public void execute() { fan.off(); }
    @Override
    public void undo() { fan.on(); }
}

