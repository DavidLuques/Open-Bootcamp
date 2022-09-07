package Ejercicio4.Inheritance;

import Ejercicio4.SmartDevice;

public class SmartPhone extends SmartDevice {
    protected double screenSize;
    protected boolean touchScreen;
    public int picturesTaken;

    //constructors

    public SmartPhone(){};

    public SmartPhone(String brand, double lifeExpectancy, double batteryPercent, boolean connectivity, boolean camera, boolean screen, double screenSize, boolean touchScreen,
                      int picturesTaken){
        super(brand,lifeExpectancy, batteryPercent, connectivity, camera, screen);
        this.screenSize = screenSize;
        this.touchScreen = touchScreen;
        this.picturesTaken = picturesTaken;

    }

   public  void TakePicture(){
        picturesTaken++;
    }
    public void printTakenPicture(){
        System.out.println(
                "Picture taken: " + picturesTaken);

    }

}
