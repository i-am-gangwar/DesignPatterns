package DesignPatterns.structural.adapterPattern;

// Step 2: Adaptee (incompatible class)

public class LegacyPlayer {
    public void playFile(String file) {
        System.out.println("Playing file using LegacyPlayer: " + file);
    }
}