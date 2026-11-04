package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Comprobación de Signo Negativo");

        System.out.println("Ingresa un número decimal: ");

        double n=scanner.nextDouble();

        boolean menorqueCero=n<0;

        System.out.println("¿El número ingresado es menor que cero? " + menorqueCero);

        scanner.close();
        
    }
    
}
