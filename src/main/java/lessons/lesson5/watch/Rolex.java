package lessons.lesson5.watch;

import lessons.lesson5.watch.parts.Gear;

public class Rolex {
    private String serialNum = "default";
    private Gear[] gears;

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public Gear[] getGears() {
        return gears;
    }

    public void setGears(Gear[] gears) {
        this.gears = gears;
    }

    public Rolex(String serialNum, Gear[] gears) {
        this.serialNum = serialNum;
        this.gears = gears;
    }

    public void show() {
        System.out.println("Serial number: \t" + serialNum);
        for (Gear gear : gears) {
            gear.show();
        }
    }
}
