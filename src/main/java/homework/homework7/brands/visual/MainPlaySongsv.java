package homework.homework7.brands.visual;

public class MainPlaySongsv {
    public static void main(String[] args) {
        Player1v sanyo = new Player1v ("song1");
        System.out.println("Player 1:");
        sanyo.playSong();
        Player2v lg = new Player2v ("song1");
        System.out.println("Player 2:");
        lg.playSong();
        String[] playlist = new String[]{"song1", "song2", "song3"};
        Player3v panasonic = new Player3v(playlist);
        System.out.println("Player 3:");
        panasonic.playSong();
        panasonic.playAllSongs();
        String[] playlist2 = new String[]{"song1", "song2", "song3"};
        Player4v genius = new Player4v(playlist2);
        System.out.println("Player 4:");
        genius.playSong();
        genius.playAllSongs();
        String[] playlist3 = new String[]{"song1", "song2", "song3"};
        Player5v hp = new Player5v(playlist3);
        System.out.println("Player 5:");
        hp.playSong();
        hp.playAllSongs();
        String[] playlist4 = new String[]{"song1", "song2", "song3", "song4", "song5"};
        Player6v lenovo = new Player6v(playlist4);
        System.out.println("Player 6:");
        lenovo.playSong();
        lenovo.playAllSongs();
        System.out.println("SH");
        lenovo.shuffle();
    }
}
