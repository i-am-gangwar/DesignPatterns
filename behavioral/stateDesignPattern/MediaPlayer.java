package DesignPatterns.behavioral.stateDesignPattern;

import DesignPatterns.behavioral.stateDesignPattern.mediaPlayer.PauseState;
import DesignPatterns.behavioral.stateDesignPattern.mediaPlayer.State;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<String> songsList;
    private int currentSongIndex;
    private State state;

    public MediaPlayer(List<String> songsList) {
        this.songsList = songsList;
        this.currentSongIndex = 0;
        this.state = new PauseState(); // default state
    }

    // delegate methods
    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }

    // helpers
    public void setState(State state) {
        this.state = state;
    }

    public String getCurrentSong() {
        if (songsList.isEmpty()) return "No songs loaded";
        return songsList.get(currentSongIndex);
    }

    public void nextSong() {
        if (!songsList.isEmpty()) {
            currentSongIndex = (currentSongIndex + 1) % songsList.size();
        }
    }

    public void prevSong() {
        if (!songsList.isEmpty()) {
            currentSongIndex = (currentSongIndex - 1 + songsList.size()) % songsList.size();
        }
    }




}
