package DesignPatterns.structural.bridgePattern;

import DesignPatterns.structural.bridgePattern.abstractions.AdvancedRemote;
import DesignPatterns.structural.bridgePattern.abstractions.BasicRemote;
import DesignPatterns.structural.bridgePattern.abstractions.RemoteControl;
import DesignPatterns.structural.bridgePattern.implementor.Device;
import DesignPatterns.structural.bridgePattern.implementor.Radio;
import DesignPatterns.structural.bridgePattern.implementor.TV;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();
        System.out.println("---------------basic remote");
        RemoteControl basicRemoteForTv = new BasicRemote(tv);
        basicRemoteForTv.on();
        basicRemoteForTv.setVolume(20);
        basicRemoteForTv.off();

        System.out.println("---------------Advance remote");

        RemoteControl advancedRemoteForRadio = new AdvancedRemote(radio);
        advancedRemoteForRadio.on();
        advancedRemoteForRadio.setChannel(101);
        ((AdvancedRemote) advancedRemoteForRadio).mute();
        advancedRemoteForRadio.off();
    }
}
