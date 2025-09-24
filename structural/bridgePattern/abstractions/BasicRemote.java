package DesignPatterns.structural.bridgePattern.abstractions;

import DesignPatterns.structural.bridgePattern.implementor.Device;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void on() { device.powerOn(); }

    @Override
    public void off() { device.powerOff(); }

    @Override
    public void setVolume(int volume) { device.setVolume(volume); }

    @Override
    public void setChannel(int channel) { device.setChannel(channel); }
}