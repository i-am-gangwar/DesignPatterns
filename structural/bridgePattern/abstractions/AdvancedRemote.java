package DesignPatterns.structural.bridgePattern.abstractions;

import DesignPatterns.structural.bridgePattern.implementor.Device;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void on() {
        device.powerOn();
        System.out.println("Advanced features activated");
    }

    @Override
    public void off() { device.powerOff(); }

    @Override
    public void setVolume(int volume) { device.setVolume(volume); }

    @Override
    public void setChannel(int channel) { device.setChannel(channel); }

    public void mute() {
        System.out.println("Device is muted");
        device.setVolume(0);
    }
}
