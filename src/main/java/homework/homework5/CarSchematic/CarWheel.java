package homework.homework5.CarSchematic;

public class CarWheel {
    private double durability;


    public CarWheel() {
        this.durability = 1;
    }

    public CarWheel(double durability) {
        this.durability = durability;
    }

    public void setDurability(double durability) {
        if (durability < 0 || durability > 1) {
            throw new UnsupportedOperationException("Dur >0 && < 1");
        }

        this.durability = durability;

    }

    public double getDurability() {
        return durability;
    }

    public void newTire() {
        durability = 1;
    }

    public void useTire(int x) {
        durability = durability - ((durability * x) / 100);
    }

    public double checkTire() {
        return durability;
    }

    public void information() {
        System.out.println("Tire durability: " + durability);
    }
}
