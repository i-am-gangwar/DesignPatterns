package behavioral.commandPattern.concreteCommands;

import behavioral.commandPattern.Command;
import behavioral.commandPattern.Fan;

public class FanOnCommand implements Command {
    private Fan fan;
    public FanOnCommand(Fan fan) { this.fan = fan; }

    @Override
    public void execute() { fan.on(); }
    @Override
    public void undo() { fan.off(); }
}
