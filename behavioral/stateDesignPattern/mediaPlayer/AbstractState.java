package DesignPatterns.behavioral.stateDesignPattern.mediaPlayer;

import DesignPatterns.behavioral.stateDesignPattern.MediaPlayer;

public abstract class AbstractState  implements State{
    public void play(MediaPlayer player) { System.out.println("Invalid play action"); }
    public void pause(MediaPlayer player) { System.out.println("Invalid pause action"); }
    public void next(MediaPlayer player) { System.out.println("Invalid next action"); }
    public void prev(MediaPlayer player) { System.out.println("Invalid prev action"); }
}
