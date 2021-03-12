package Homework.Homework5.CarSchematic;

public class CarDoor {
    private boolean doorOpen;
    private boolean windowOpen;

    public CarDoor() {
        this.doorOpen = false;
        this.windowOpen = false;
    }
    public CarDoor(boolean doorOpen, boolean windowOpen) {
        this.doorOpen = doorOpen;
        this.windowOpen = windowOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

    public boolean getDoorOpen() {
        return doorOpen;
    }

    public boolean getWindowOpen() {
        return windowOpen;
    }

    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void openWindow() {
        windowOpen = true;
    }

    public void closeWindow() {
        windowOpen = false;
    }

    public void changeDoor() {
        if (doorOpen = true) {
            doorOpen = false;
        } else {
            doorOpen = true;
        }
    }
    public void changeWindow() {
        windowOpen = !windowOpen;
        //windowOpen = windowOpen = true ? false : true;
    }
    public void checkDoors() {
        System.out.println("Windows: " + windowOpen);
        System.out.println("Doors: " + doorOpen);
    }
}
