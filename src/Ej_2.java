import java.util.Scanner;

/**
 * Programa que lee dos numeros real relativo al lado de un cuadrado,
 * calcula el área y visualiza el resultado.
 *
 * @autor Pablo Carrillo
 */


public class Ej_2 {
    public static void main(String[] args) {

        //Crear un objeto Scanner para leer la entrada del usuario.

        Scanner entrada = new Scanner(System.in);

        //Pedir al usuario que ingrese la longitud de un lado del cuadrado

        System.out.println("Ingrese la longitud de un lado del cuadrado: ");
        double lado = entrada.nextDouble();

        //Calcular el area del cuadrado (Área = lado * lado)
        double area = lado * lado;

        //mostrar el resultado.
        System.out.println("el area de un cuadrado es: " + area );





    }
}
