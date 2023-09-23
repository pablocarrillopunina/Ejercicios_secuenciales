/*
* Programa que lee dos numeros enteros, calcula la suma y visualiza el resultado.
* */

import java.util.*;
public class Ej_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Introduce el primer numero: " );
        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int num2 = entrada.nextInt();

        int suma = num1 + num2;

        System.out.println(" La suma total es: " + suma );

    }
}
