package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Evaluación de Triángulo Isósceles");

        System.out.println("Ingresa la medida del 1er lado: ");

        double lado1=scanner.nextDouble();

        System.out.println("Ingresa la medida del 2do lado: ");

        double lado2=scanner.nextDouble();

        System.out.println("Ingresa la medida del 3er lado: ");

        double lado3=scanner.nextDouble();

        boolean trianguloIsoseles= (lado1==lado2) || (lado1==lado3) || (lado2==lado3);

        System.out.println("¿Es un triángulo isóseles? " + trianguloIsoseles);

        scanner.close();
        
    }
    
}
