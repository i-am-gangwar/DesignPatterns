package DesignPatterns.structural.bridgePattern.implementor;

public interface Device {
    void powerOn();
    void powerOff();
    void setVolume(int volume);
    void setChannel(int channel);
}
