package DesignPatterns.structural.bridgePattern.implementor;

public class TV implements Device {
    @Override
    public void powerOn() { System.out.println("TV is ON"); }

    @Override
    public void powerOff() { System.out.println("TV is OFF"); }

    @Override
    public void setVolume(int volume) { System.out.println("TV Volume set to " + volume); }

    @Override
    public void setChannel(int channel) { System.out.println("TV Channel set to " + channel); }
}
