package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio40 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Depreciación Lineal Anual");

        System.out.println("Ingresa el valor inicial de la maquinaria: ");

        double valorInicial=scanner.nextDouble();

        System.out.println("Ingresa el valor de rescate de la maquinaria: ");

        double valorRescate=scanner.nextDouble();

        System.out.println("Ingresa los años de vida útil: ");

        double vidaUtil=scanner.nextDouble();

        double depreciacionAnual=(valorInicial-valorRescate)/vidaUtil;

        System.out.println("El activo sufre un costo de depreciación cada año de: " + depreciacionAnual + " pesos.");

        scanner.close();
        
    }
    
}
