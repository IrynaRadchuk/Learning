package Homework.Homework5.CarSchematic;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    private String releaseDate;
    private String engineType;
    private int maxSpeed;
    private double speedBoost;
    private int passengerSeats;
    private int passenger;
    private int speed;
    private CarDoor[] doors;
    private CarWheel[] wheels;

    public Car(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Car(String releaseDate, String engineType, int maxSpeed, double speedBoost, int passengerSeats, int passenger, int speed) {
        this.releaseDate = releaseDate;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.speedBoost = speedBoost;
        this.passengerSeats = passengerSeats;
        this.passenger = passenger;
        this.speed = speed;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getSpeedBoost() {
        return speedBoost;
    }

    public void setSpeedBoost(double speedBoost) {
        this.speedBoost = speedBoost;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public CarDoor[] getDoors() {
        return doors;
    }

    public void setDoors(CarDoor[] doors) {
        this.doors = doors;
    }

    public CarWheel[] getWheels() {
        return wheels;
    }

    public void setWheels(CarWheel[] wheels) {
        this.wheels = wheels;
    }


    public void changeSpeed(int speed) {
        this.speed = speed;
    }

    public void addPassenger() {
        passenger++;
    }

    public void deletePassenger() {
        passenger--;
    }

    public CarDoor getDoorByNumber(int i) {
        if (i >= doors.length) {
            System.err.printf("ты тупой ублюдок дверей то %d !!! ", doors.length);
            throw new IndexOutOfBoundsException("лезут тут всякие со своими дверями под индексом" + i);
        }
        CarDoor door = doors[i];
        return door;
    }

    public CarWheel getWheelByNumber(int i) {
        if (i >= wheels.length) {
            System.err.printf("количество колёс %d !!! ", wheels.length);
            throw new IndexOutOfBoundsException("лезут тут всякие со своими колесами под индексом" + i);
        }
        CarWheel wheel = wheels[i];
        return wheel;
    }

    public void wheelsOff() {
        CarWheel[] wheelsOff = new CarWheel[0];
    }

    public void setWheels(int x) {
        CarWheel[] newWheels = new CarWheel[this.wheels.length + x];
        for (int i = 0; i < wheels.length; i++) {
            newWheels[i] = wheels[i];
        }
        for (int i = wheels.length; i < newWheels.length; i++) {
            CarWheel setWheel2 = new CarWheel();
//            setWheel2.newTire();
            newWheels[i] = setWheel2;
        }
        this.wheels = newWheels;

    }

    public void wheelInfo(CarWheel[] wheels) {
        for (CarWheel wheel : wheels) {
            wheel.information();
        }
    }

    public void speedMaximum() {
        double speedMaximum;
        if (passenger == 0) {
            speedMaximum = 0;
        } else {
            double minTireDurability = 1;
            for (int i = 0; i < wheels.length; i++) {
                CarWheel wheel = wheels[i];
                double wheelDur = wheel.checkTire();
                if (minTireDurability > wheelDur) {
                    minTireDurability = wheelDur;
                }
            }
            speedMaximum = minTireDurability * maxSpeed;
        }
        System.out.println("Speed Maximum: " + speedMaximum);
    }

    public void CarInformation() {
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Speed Boost: " + speedBoost);
        System.out.println("Passenger Seats: " + passengerSeats);
        System.out.println("Passengers: " + passenger);
        System.out.println("Speed: " + speed);
        System.out.println("Doors: " + Arrays.toString(doors));
        System.out.println("Wheels: " + Arrays.toString(wheels));
        Car car1 = new Car("today");
        car1.speedMaximum();
    }
}