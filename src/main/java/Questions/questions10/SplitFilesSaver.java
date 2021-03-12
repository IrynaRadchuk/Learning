package Questions.questions10;

public class SplitFilesSaver {
    public static void main(String[] args) {
FlowerStore store = new FlowerStore();
//store.flowers.add(new Flower("tulip",12));
//        store.flowers.add(new Flower("rose",1));
//        store.flowers.add(new Flower("lily",123));
//        store.flowers.add(new Flower("camomile",142));
//store.save("files/questions10/store_save.txt");
        store.load("files/questions10/store_save.txt");
        System.out.println(store);
    }
}
