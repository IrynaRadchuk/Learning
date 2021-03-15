package homework.homework7;

public abstract class Players {

    private final int price;
    private String songName;

    public Players(int price, String songName) {
        this.price = price;
        this.songName = songName;
    }

    public int getPrice() {
        return price;
    }
    public void playSong () {
        System.out.println("Playing: "  + songName);
    }
}
