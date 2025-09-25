package DesignPatterns.behavioral.commandPattern;

import DesignPatterns.behavioral.commandPattern.concreteCommands.FanOffCommand;
import DesignPatterns.behavioral.commandPattern.concreteCommands.FanOnCommand;
import DesignPatterns.behavioral.commandPattern.concreteCommands.LightOffCommand;
import DesignPatterns.behavioral.commandPattern.concreteCommands.LightOnCommand;

// Step 5: Client
public class CommandPatternWithUndo {
    public static void main(String[] args) {

        RemoteControl remote = new RemoteControl(2);

        Light livingRoomLight = new Light("Living Room");
        Fan ceilingFan = new Fan("Bedroom");

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(ceilingFan);
        Command fanOff = new FanOffCommand(ceilingFan);

        // Assign commands to slots
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, fanOn, fanOff);

        // Test
        remote.pressOn(0);   // Light ON
        remote.pressOff(0);  // Light OFF
        remote.pressUndo();  // Undo Light OFF → Light ON

        remote.pressOn(1);   // Fan ON
        remote.pressOff(1);  // Fan OFF
        remote.pressUndo();  // Undo Fan OFF → Fan ON
    }
}
