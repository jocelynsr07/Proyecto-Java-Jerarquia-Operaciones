package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Caída Libre (Distancia Recorrida)");

        System.out.println("Ingresa el tiempo en segundos: ");

        double tiempo=scanner.nextDouble();

        double constGrav=9.81;

        double distanciaCaida=(constGrav*Math.pow(tiempo, 2))/2;

        System.out.println("La distancia de caída es de: " + distanciaCaida + " metros");

        scanner.close();
        
    }
    
}
