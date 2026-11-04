package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Área Total de un Paralelepípedo");

        System.out.println("Ingresa el largo (a): ");

        double a=scanner.nextDouble();

        System.out.println("Ingresa el ancho (b): ");

        double b=scanner.nextDouble();

        System.out.println("Ingresa el alto (c): ");

        double c=scanner.nextDouble();

        double areaTotal=2*((a*b)+(a*c)+(b*c));

        System.out.println("El área superficial total del paralelepípedo es: " + areaTotal );

        scanner.close();
        
    }
    
}
