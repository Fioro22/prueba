
package Ejercicios;

import java.util.Scanner;


public class EjercicioExtra913 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamaño de la escalera de numeros?");
        int numero = leer.nextInt();
        for (int i = 1; i <= numero ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }System.out.println("");
        }
        
    }

}
