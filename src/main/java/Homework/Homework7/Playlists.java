package Homework.Homework7;

public abstract class Playlists extends Players{
    String[] playlist;

    public Playlists(int price, String songName, String[] playlist) {
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
            System.out.println("Playing: " + playlist[i]);
        }
    }
}
