package Homework.Homework7.brands.visual;


public class Player5v extends Playlistsv {
    public Player5v(String[] playlist) {
        super(50, playlist [0], playlist);
    }

    @Override
    public void playAllSongs() {
        for (int i = getPlaylist().length-1; i >= 0 ; i--) {
            System.out.println("Playing: "  + getPlaylist()[i]);
        }
    }
}
