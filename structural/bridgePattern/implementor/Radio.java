package structural.bridgePattern.implementor;

public class Radio implements Device {
    @Override
    public void powerOn() { System.out.println("Radio is ON"); }

    @Override
    public void powerOff() { System.out.println("Radio is OFF"); }

    @Override
    public void setVolume(int volume) { System.out.println("Radio Volume set to " + volume); }

    @Override
    public void setChannel(int channel) { System.out.println("Radio Frequency set to " + channel); }
}
