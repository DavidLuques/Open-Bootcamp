package Ejercicio5;
import Ejercicio5.Coche;


public class Main {

    // interface
    static CocheCRUD coche = new CocheCRUDImpl();

    public static void main(String[] args) {


        coche.findAll();

        coche.save(new Coche());



    }

}
