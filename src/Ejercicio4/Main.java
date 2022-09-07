package Ejercicio4;

import Ejercicio4.Inheritance.SmartPhone;

public class Main {
    public static void main(String[] args) {
    SmartDevice device1 = new SmartDevice();
        System.out.println(device1);
        System.out.println(device1.connectivity);

//child,subclass
        SmartDevice device2;
        device2= new SmartPhone("motorolla",4,54,true,true,true,5.7,true,0);
        // casteando
        System.out.println("\nthis is a way to create a SmartPhone by father class");
    ((SmartPhone) device2).TakePicture();
    ((SmartPhone) device2).TakePicture();
    ((SmartPhone) device2).printTakenPicture();


    System.out.println("the pic that has been taken is :" + (((SmartPhone) device2).picturesTaken));

        System.out.println("\nnow this is another device created by child class");

    SmartPhone device3;
    device3= new SmartPhone("nokia",4,54,true,true,false,2.3,false,0);

    device3.TakePicture();

    device3.printTakenPicture();

        System.out.println("this is another way to print taken pictures: " + device3.picturesTaken);



    }


}





