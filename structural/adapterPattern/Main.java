package DesignPatterns.structural.adapterPattern;

// Step 4: Client uses only MediaPlayer interface
public class Main {
        public static void main(String[] args) {
            MediaPlayer player = new MediaAdapter(new LegacyPlayer());
            player.play("song.mp3");   // ✅ works fine
            player.play("movie.mp4");
        }

}
