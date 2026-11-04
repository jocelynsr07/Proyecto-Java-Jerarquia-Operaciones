package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Comprobación de Temperatura de Congelación");

        System.out.println("Ingresa la temperatura del agua en grados Celsius: ");

        double tempCelsius=scanner.nextDouble();

        boolean estadoCongelacion=tempCelsius<=0;

        System.out.println("¿El agua se encuentra en estado de congelación? " + estadoCongelacion);

        scanner.close();
        
    }
    
}
