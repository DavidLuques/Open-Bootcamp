package Ejercicio2;
/**
 *  Considero el IVA de un 21% (argentina)
 */
public class CalcularIva {

    public static void main(String[] args) {
        float monto=200f;
    float montoCalculado=calcularPrecio(monto);
        System.out.println("El precio es: "+ monto);
        System.out.println("El precio con IVA es: "+ montoCalculado);
    }

    private static float calcularPrecio(float i) {
        return  (float)(i*1.21);
    }

}
