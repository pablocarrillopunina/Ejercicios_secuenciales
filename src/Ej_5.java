/**
 * Programa que lee un número real relativo al radio de una circunferencia,
 * calcula su perímetro y  visualiza en pantalla.
 * */
import java.util.*;
public class Ej_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        System.out.println("Introduce el perimetro: ");
        double pi = Math.PI;

        double perimetro = 2 * pi * radio;

        System.out.println(" El perimetro de la circunferencia es " + perimetro );

    }
}
