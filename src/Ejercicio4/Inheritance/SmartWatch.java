package Ejercicio4.Inheritance;

import Ejercicio4.SmartDevice;

/**
 * Child class, Subclass.
 */

public class SmartWatch extends SmartDevice {
    double time;

    //constructors
    public SmartWatch(){}

    public SmartWatch(double time){    this.time = time; }

    //methods

    public void setTime(double time){ this.time = time; }

    public void showTime(){
        System.out.println("Time: " + time);

    }


}
