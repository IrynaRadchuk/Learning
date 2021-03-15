package homework.homework10;

public enum FruitType {
    strawberry(2,"firma"), pear(3,"firma"), apple(2,"firma"), plum(4,"firma"), lemon(1,"firma"), orange(1,"firma"), banana(1,"firma");

    int weight;
    String producer;

    FruitType(int weight, String producer) {
        this.weight = weight;
        this.producer = producer;
    }

    public int getWeight() {
        return weight;
    }

    public String getProducer() {
        return producer;
    }
}
