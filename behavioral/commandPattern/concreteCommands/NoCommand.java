package DesignPatterns.behavioral.commandPattern.concreteCommands;

import DesignPatterns.behavioral.commandPattern.Command;

// Null Object Pattern (to avoid null checks)
public class NoCommand implements Command {
    @Override public void execute() { }
    @Override public void undo() { }
}
