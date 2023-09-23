/**
 * Programa que lee dos números reales relativos al lado y el apotema de un pentágono,
 * calcula el area y visualiza el resultado.
 * */

import java.util.*;
public class Ej_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese la longitud del lado del pentagono: ");
        double lado = sc.nextDouble();

        System.out.println(" Ingese el apotema del Pentagono: ");
        double apotema = sc.nextDouble();

        double resultado_area = (5 * lado * apotema) / 2;

        System.out.println(" El area del pentagono es: " + resultado_area);


    }
}
