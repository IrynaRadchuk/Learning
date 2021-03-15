package homework.homework7.brands;

import homework.homework7.Playlists;

public class Player6 extends Playlists {
    public Player6(String[] playlist) {
        super(60, playlist[0], playlist);
    }
    public void shuffle () {
//        Random rnd = new Random();
//        for(int i = 0; i < getPlaylist().length; i++) {
//            int index = rnd.nextInt(i + 1);
//            String a = getPlaylist()[index];
//            getPlaylist()[index] = getPlaylist()[i];
//            getPlaylist()[i] = a;
//            System.out.println("Playing: "  + getPlaylist()[i]);
//        }
        for (int i =0 ; i<getPlaylist().length; i ++){
            int n = (int) Math.round(-0.4999 + i  + Math.random()*(getPlaylist().length-0.0002-i));             // -0.4999 & +(.length-0.0002) сравнивают шансы выпадения граничных значений (0 и последнего элемента массива)
            String temp = getPlaylist()[i];
            getPlaylist()[i] = getPlaylist()[n];
            getPlaylist() [n] = temp;
            System.out.println("Playing: "  + getPlaylist()[i]);
        }
    }

}