package Lessons.Lesson5.Watch.Parts;

public class Gear {
    private String metal = "gold";

    public Gear(String metal, float radius) {
        this.metal = metal;
        this.radius = radius;
    }

    private float radius = 1f;

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void show () {
        System.out.println("\t Metal:" + metal);
        System.out.println("\t Radius:" + radius);
    }
}
