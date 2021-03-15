package homework.homework7;

import homework.homework7.brands.*;

public class MainPlaySongs {
    public static void main(String[] args) {


//        Player1 sanyo = new Player1("song1");
//        System.out.println("Player 1:");
//        sanyo.playSong();
//        Player2 lg = new Player2("song1");
//        System.out.println("Player 2:");
//        lg.playSong();
//        String[] playlist = new String[]{"song1", "song2", "song3"};
////        String[] playlist1 = new String[]{};
//        Player3 panasonic = new Player3(playlist);
//        System.out.println("Player 3:");
//        panasonic.playSong();
//        panasonic.playAllSongs();
//        String[] playlist2 = new String[]{"song1", "song2", "song3"};
//        Player4 genius = new Player4(playlist2);
//        System.out.println("Player 4:");
//        genius.playSong();
//        genius.playAllSongs();
//        String[] playlist3 = new String[]{"song1", "song2", "song3"};
//        Player5 hp = new Player5(playlist3);
//        System.out.println("Player 5:");
//        hp.playSong();
//        hp.playAllSongs();
        String[] playlist4 = new String[]{"song1", "song2", "song3", "song4", "song5"};
        Player6 lenovo = new Player6(playlist4);
        System.out.println("Player 6:");
        lenovo.playSong();
        lenovo.playAllSongs();
        System.out.println("SH");
        lenovo.shuffle();
    }
}
