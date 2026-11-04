package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Consumo Promedio de Combustible");

        System.out.println("Ingresa los kilómetros recorridos: ");

        double kmRecorridos=scanner.nextDouble();

        System.out.println("Ingresa los litros de gasolina consumidos: ");

        double litrosGasolina=scanner.nextDouble();

        double consumoPromedio=kmRecorridos/litrosGasolina;

        System.out.println("El rendimiento promedio del combustible es de: " + consumoPromedio + " km por lt. ");

        scanner.close();
        
    }
    
}
