package homework.homework8;

public class FlowerStore {
    public static int balance = 0;

    public Flowers[] sell(int rosesQuantity, int tulipsQuantity, int camomilesQuantity) {
        int totalQuantity = rosesQuantity + tulipsQuantity + camomilesQuantity;
        Flowers[] bouquet = new Flowers[totalQuantity];
        for (int i = 0; i < rosesQuantity; i++) {
            Roses rose = new Roses(rosesQuantity);
            bouquet[i] = rose;
        }
        for (int i = rosesQuantity; i < tulipsQuantity + rosesQuantity; i++) {
            Tulips tulip = new Tulips(tulipsQuantity);
            bouquet[i] = tulip;
        }
        for (int i = tulipsQuantity + rosesQuantity; i < totalQuantity; i++) {
            Camomiles camomile = new Camomiles(camomilesQuantity);
            bouquet[i] = camomile;
        }
        addBouquetPrice(bouquet);
        return bouquet;
    }

    public Flowers[] sellSequence(int rosesQuantity, int tulipsQuantity, int camomilesQuantity) {
        int totalQuantity = rosesQuantity + tulipsQuantity + camomilesQuantity;
        Flowers[] bouquet = new Flowers[totalQuantity];
        int i = 0;
        int tempRose = rosesQuantity;
        int tempTulip = tulipsQuantity;
        int tempCamomile = camomilesQuantity;
        while (i < totalQuantity) {
            if (tempRose > 0) {
                Roses rose = new Roses(rosesQuantity);
                bouquet[i] = rose;
                i++;
                tempRose--;
            }
            if (tempTulip > 0) {
                Tulips tulip = new Tulips(tulipsQuantity);
                bouquet[i] = tulip;
                i++;
                tempTulip--;
            }
            if (tempCamomile > 0) {
                Camomiles camomile = new Camomiles(camomilesQuantity);
                bouquet[i] = camomile;
                i++;
                tempCamomile--;
            }
        }
        addBouquetPrice(bouquet);
        return bouquet;
    }

    private void addBouquetPrice(Flowers[] bouquet) {
        for (Flowers flowers : bouquet) {
            balance = balance + flowers.getPrice();
        }
    }

    public int wallet() {

        return balance;}}
