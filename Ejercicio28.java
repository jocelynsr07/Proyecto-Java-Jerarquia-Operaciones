package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Exclusión de Múltiplos de 10");

        System.out.println("Ingresa un numero entero positivo: ");

        int numeroEntero=scanner.nextInt();

        boolean exclusionMultiplos=numeroEntero%10 != 0;

        System.out.println("¿El número ingresado NO termina en cero? " + exclusionMultiplos);

        scanner.close();
        
    }
    
}
