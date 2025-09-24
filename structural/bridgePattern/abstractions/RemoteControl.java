package DesignPatterns.structural.bridgePattern.abstractions;

import DesignPatterns.structural.bridgePattern.implementor.Device;

public abstract class RemoteControl {
    protected Device device; // Bridge reference

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void on();
    public abstract void off();
    public abstract void setVolume(int volume);
    public abstract void setChannel(int channel);
}