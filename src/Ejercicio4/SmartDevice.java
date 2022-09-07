package Ejercicio4;

public class SmartDevice {
    protected String brand;
    protected double lifeExpectancy;
    protected  double batteryPercent;
    protected  boolean connectivity;
    protected boolean camera;
    protected  boolean screen;

    public SmartDevice() {  }
    public SmartDevice(String brand, double lifeExpectancy, double batteryPercent, boolean connectivity, boolean camera, boolean screen){
        this.brand=brand;
         this.lifeExpectancy=lifeExpectancy;
         this.batteryPercent=batteryPercent;
         this.connectivity=connectivity;
         this.camera=camera;
         this.screen=screen;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
    this.lifeExpectancy = lifeExpectancy;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", lifeExpectancy=" + lifeExpectancy +
                ", batteryPercent=" + batteryPercent +
                ", connectivity=" + connectivity +
                ", camera=" + camera +
                ", screen=" + screen +
                '}';
    }
}

