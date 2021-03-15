package homework.homework5.CarSchematic;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String c;
        do {
            workWithCar();
            scanner.nextLine();
            System.out.println("Other task y/n");
            c = scanner.nextLine();
        }
        while (c.equals("y"));
    }

    private static void workWithCar() {
        System.out.println("Task #");
        int x = scanner.nextInt();
        CarDoor door1 = new CarDoor();
        CarWheel wheel1 = new CarWheel();
        Car car1 = new Car("27.09.2020");
        switch (x) {
            default:
                System.out.println("Wrong input");
                break;
            case 1:
                door1.openDoor();
                System.out.println("The door is open");
                break;
            case 2:
                door1.closeDoor();
                System.out.println("The door is closed");
                break;
            case 3:
                door1.changeDoor();
                System.out.println("The door is changed");
                break;
            case 4:
                door1.openWindow();
                System.out.println("The window is opened");
                break;
            case 5:
                door1.closeWindow();
                System.out.println("The window is closed");
                break;
            case 6:
                door1.changeWindow();
                System.out.println("The window is changed");
                break;
            case 7:
                door1.checkDoors();
                break;
            case 8:
                wheel1.newTire();
                System.out.println("The tire is changed");
                break;
            case 9:
                System.out.println("Enter usage percentage");
                wheel1.useTire(scanner.nextInt());
                System.out.println("The tire is used");
                break;
            case 10:
                System.out.println("Durability of the tire: " + wheel1.checkTire());
                break;
            case 11:
                wheel1.information();
                break;
            case 12:
                System.out.println("Enter new speed");
                car1.changeSpeed(scanner.nextInt());
                System.out.println("The speed is changed");
                break;
            case 13:
                car1.addPassenger();
                System.out.println("The passenger added");
                break;
            case 14:
                car1.deletePassenger();
                System.out.println("The passenger deleted");
                break;
            case 15:
                System.out.println("Enter the door number");
                car1.getDoorByNumber(scanner.nextInt());
                System.out.println("The door is added");
                break;
            case 16:
                System.out.println("Enter the wheel number");
                car1.getWheelByNumber(scanner.nextInt());
                System.out.println("The wheel is added");
                break;
            case 17:
                car1.wheelsOff();
                System.out.println("The wheels are deleted");
                break;
            case 18:
                System.out.println("Enter the quantity of wheels");
                car1.setWheels(scanner.nextInt());
                System.out.println("The wheels are set");
                break;
            case 19:
                car1.speedMaximum();
                break;
        }
    }
}
