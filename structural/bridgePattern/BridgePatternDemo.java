package structural.bridgePattern;

import structural.bridgePattern.abstractions.AdvancedRemote;
import structural.bridgePattern.abstractions.BasicRemote;
import structural.bridgePattern.abstractions.RemoteControl;
import structural.bridgePattern.implementor.Device;
import structural.bridgePattern.implementor.Radio;
import structural.bridgePattern.implementor.TV;

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
