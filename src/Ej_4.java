/**
 * Programa que lee el año de nacimiento y el año actual para calcular la edad de una persona
 * y visualiza el resultado en pantalla.
 * */

import java.util.*;
public class Ej_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese su año de nacimiento: ");
        int añoNacimiento = sc.nextInt();

        System.out.println(" Ingrese el año actual: ");
        int añoActual = sc.nextInt();

        int resultado = añoActual - añoNacimiento;
        System.out.println(" Su edad es: " + resultado + " años ");
    }
}
