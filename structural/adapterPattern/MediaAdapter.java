package structural.adapterPattern;

// Step 3: Adapter (bridge)
public class MediaAdapter implements MediaPlayer{
    private LegacyPlayer legacyPlayer;
    public MediaAdapter(LegacyPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }
    @Override
    public void play(String filename) {
        // translate call
        legacyPlayer.playFile(filename);
    }
}
