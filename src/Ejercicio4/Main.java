package Ejercicio4;

import Ejercicio4.Inheritance.SmartPhone;

public class Main {
    public static void main(String[] args) {
    SmartDevice device1 = new SmartDevice();
        System.out.println(device1);
        System.out.println(device1.connectivity);

//child,subclass
        SmartDevice device2;
    device2= new SmartPhone("motorolla",4,54,true,true,true,4.7,true,0);
    ((SmartPhone) device2).TakePicture();
    ((SmartPhone) device2).TakePicture();
    ((SmartPhone) device2).printTakenPicture();


    }


}
