package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Comprobación de Múltiplo de 3 y no de 2");

        System.out.println("Ingresa un número entero: ");

        int numero=scanner.nextInt();

        boolean cumpleCondicion=(numero%3 == 0) && (numero%2 != 0);

        System.out.println("¿El número ingresado es múltiplo de 3 y no de 2? " + cumpleCondicion);

        scanner.close();
        
    }
    
}
