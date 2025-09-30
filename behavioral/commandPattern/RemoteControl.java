package behavioral.commandPattern;

import behavioral.commandPattern.concreteCommands.NoCommand;

import java.util.Stack;

// Step 4: Invoker (Remote Control with multiple slots)
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> history = new Stack<>();

    public RemoteControl(int slots) {
        onCommands = new Command[slots];
        offCommands = new Command[slots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOn(int slot) {
        onCommands[slot].execute();
        history.push(onCommands[slot]);
    }

    public void pressOff(int slot) {
        offCommands[slot].execute();
        history.push(offCommands[slot]);
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            System.out.print("Undoing: ");
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo!");
        }
    }
}
