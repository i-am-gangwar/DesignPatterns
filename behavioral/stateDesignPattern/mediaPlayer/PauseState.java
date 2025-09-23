package DesignPatterns.behavioral.stateDesignPattern.mediaPlayer;

import DesignPatterns.behavioral.stateDesignPattern.MediaPlayer;

public class PauseState extends AbstractState{

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming: " + player.getCurrentSong());
        player.setState(new PlayState());
    }
    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused: " + player.getCurrentSong());
    }

    @Override
    public void next(MediaPlayer player) {
        player.nextSong();
        System.out.println("Switched to next (paused): " + player.getCurrentSong());
    }

    @Override
    public void prev(MediaPlayer player) {
        player.prevSong();
        System.out.println("Switched to previous (paused): " + player.getCurrentSong());
    }
}
