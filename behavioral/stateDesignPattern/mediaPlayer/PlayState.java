package DesignPatterns.behavioral.stateDesignPattern.mediaPlayer;
import DesignPatterns.behavioral.stateDesignPattern.MediaPlayer;

public class PlayState extends AbstractState {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing: " + player.getCurrentSong());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Pausing: " + player.getCurrentSong());
        player.setState(new PauseState());
    }
    @Override
    public void next(MediaPlayer player) {
        player.nextSong();
        System.out.println("Playing next: " + player.getCurrentSong());
    }
    @Override
    public void prev(MediaPlayer player) {
        player.prevSong();
        System.out.println("Playing previous: " + player.getCurrentSong());
    }


}
