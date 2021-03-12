package Homework.Homework7.brands.visual;

import java.util.Random;

public class Player6v extends Playlistsv {
    public Player6v(String[] playlist) {
        super(60, playlist[0], playlist);
    }
    public void shuffle () {
        Random rnd = new Random();
        for(int i = 0; i < getPlaylist().length; i++) {
            int index = rnd.nextInt(i + 1);
            String a = getPlaylist()[index];
            getPlaylist()[index] = getPlaylist()[i];
            getPlaylist()[i] = a;
            System.out.println("Playing: "  + getPlaylist()[i]);
        }
    }
}