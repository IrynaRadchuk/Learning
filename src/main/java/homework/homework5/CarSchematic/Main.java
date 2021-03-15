package homework.homework5.CarSchematic;

public class Main {
    public static void main(String[] args) {
        CarDoor door = new CarDoor();
        System.out.println(door.getDoorOpen());
        door.openWindow();
        System.out.println(door.getWindowOpen());
        door.changeWindow();
        System.out.println(door.getWindowOpen());
        CarDoor door2 = new CarDoor(true, true);
        System.out.println(door2.getDoorOpen());
        door2.changeDoor();
        System.out.println(door2.getDoorOpen());
        System.out.println();
        CarWheel wheel = new CarWheel(0.6);
        wheel.information();
        wheel.setDurability(0.5);
        wheel.information();
        wheel.useTire(3);
        wheel.information();
        wheel.newTire();
        wheel.information();
        Car car1 = new Car("27.09.2020");
        car1.wheelInfo(new CarWheel[]{
                new CarWheel(1),
                new CarWheel(0.5),
                new CarWheel(0.8),
                new CarWheel(0.9)});
        Car car2 = new Car("27.09.2020");
        car2.CarInformation();
    }
}
