package DesignPatterns.behavioral.stateDesignPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Client
// └─> MediaPlayer.next()
//       └─> state.next(mediaPlayer)   // PlayState.next()
//             ├─> mediaPlayer.nextSong()  // helper changes index
//             └─> System.out.println("Playing next: " + mediaPlayer.getCurrentSong())




        List<String> playlist = List.of("Song A", "Song B", "Song C");
        MediaPlayer player = new MediaPlayer(playlist);

        player.play();   // Resuming: Song A
        player.next();   // Playing next: Song B
        player.pause();  // Pausing: Song B
        player.prev();   // Switched to previous (paused): Song A
        player.play();   // Resuming: Song A
    }
}
