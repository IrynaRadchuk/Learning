package Homework.Homework7.brands.visual;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Playlistsv extends Playersv {
    String[] playlist;

    public Playlistsv(int price, String songName, String[] playlist) {
        super(price, songName);
        this.playlist = playlist;
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Playing: "  + playlist[i]);
        }
    }
    public void showPlaylist(Pane root) {
        for (int i = 0; i < playlist.length; i++) {
            Text song = new Text(playlist[i]);
            song.setTranslateX(50+(i*20));
            song.setTranslateY(100+(i*20));
            root.getChildren().addAll(song);
        }
    }
}
