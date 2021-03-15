package homework.homework7.brands;

import homework.homework7.Playlists;

public class Player5 extends Playlists {
    public Player5(String[] playlist) {
        super(50, playlist [0], playlist);
    }

    @Override
    public void playAllSongs() {
        for (int i = getPlaylist().length-1; i >= 0 ; i--) {
            System.out.println("Playing: "  + getPlaylist()[i]);
        }
    }
}
