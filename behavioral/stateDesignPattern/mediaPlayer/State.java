package behavioral.stateDesignPattern.mediaPlayer;

import behavioral.stateDesignPattern.MediaPlayer;

public interface State {

    void play(MediaPlayer player);
    void pause(MediaPlayer player);
    void next(MediaPlayer player);
    void prev(MediaPlayer player);
}
