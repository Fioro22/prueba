
package Ejercicios;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("Correcto");
            
        } else {
            System.out.println("Incorrecto.");
        }
}
}