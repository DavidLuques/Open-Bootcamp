package Ejercicio1;

public class PrintAll {
    public static void main(String[] args) {
        //primitivos (sin objetos ni metodos)
        byte num3= 2;
        short num4=31000;
        int num =500000000;
        long num6=414355361;
        float num2=521512.3421531578516521f;
        double num5=32.324559994218481274129412748170;
        boolean verdad=true;
        char letra='p';

        //estructurados
        String auto="mercedes benz";

        //Wrapper (con objetos, por lo tanto metodos ademas admite null)

        Byte numero10=null;
        Short numero11=null;
        Integer numero8=24;
        Long numero12=null;
        Float numero9=null;
        Double numero13=134314314.314431;
        Boolean falso=null;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num);
        System.out.println(num6);
        System.out.println(num2);
        System.out.println(num5);
        System.out.println(verdad);
        System.out.println(letra);


        //realizo el casteo
        System.out.println(((Object)num2).getClass().getSimpleName());
        System.out.println(numero8.getClass().getSimpleName());



    }
}
