package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Distancia entre Dos Puntos (Cuadrado de la Distancia)");

        System.out.println("Ingresa la coordenada x1: ");

        double x1=scanner.nextDouble();

        System.out.println("Ingresa la coordenada y1: ");

        double y1=scanner.nextDouble();

        System.out.println("Ingresa la coordenada x2: ");

        double x2=scanner.nextDouble();

        System.out.println("Ingresa la coordenada y2: ");

        double y2=scanner.nextDouble();

        double distanciaCuadrada=Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2);

        System.out.println("El valor del cuadrado de la distancia entre ambos puntos es: " + distanciaCuadrada);

        scanner.close();
        
    }
    
}
