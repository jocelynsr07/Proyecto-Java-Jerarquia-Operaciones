package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio47 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Identificación de Al Menos Un Par");

        System.out.println("Ingresa el 1er número entero: ");

        int numeroUno=scanner.nextInt();

        System.out.println("Ingresa el 2do número entero: ");

        int numeroDos=scanner.nextInt();

        System.out.println("Ingresa el 3er número entero: ");

        int numeroTres=scanner.nextInt();

        boolean hayPar=(numeroUno%2 == 0) || (numeroDos%2 == 0) || (numeroTres%2 == 0);

        System.out.println("¿Hay algún número par? " + hayPar);

        scanner.close();
        
    }
    
}
