package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Comparación de Áreas de Dos Círculos");

        System.out.println("Ingresa el radio del 1er circulo: ");

        double radio1=scanner.nextDouble();

        System.out.println("Ingresa el radio del 2do circulo: ");

        double radio2=scanner.nextDouble();

        double area1=Math.PI*(Math.pow(radio1, 2));

        double area2=Math.PI*(Math.pow(radio2, 2));

        boolean comparacionArea=area1>area2;

        System.out.println("¿El área del 1er circulo es mayor a la del 2do circulo? " + comparacionArea);

        scanner.close();
        
    }
    
}
