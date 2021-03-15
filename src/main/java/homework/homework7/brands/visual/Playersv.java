package homework.homework7.brands.visual;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public abstract class Playersv {

    private final int price;
    private String songName;

    public Playersv(int price, String songName) {
        this.price = price;
        this.songName = songName;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing: " + songName);
    }

    public void show(Pane root) {
        Text song = new Text("Playing: " + songName);
        song.setTranslateX(50);
        song.setTranslateY(50);
        root.getChildren().addAll(song);
    }
}
