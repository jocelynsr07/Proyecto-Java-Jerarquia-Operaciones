package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Volumen de un Cilindro");

        System.out.println("Ingresa el radio del cilindro: ");

        double radio= scanner.nextDouble();

        System.out.println("Ingresa la altura del cilindro: ");

        double altura= scanner.nextDouble();

        double pi=3.1459;

        double volumenCilindro=pi*(Math.pow(radio, 2))*altura;

        System.out.println("El volumen del cilindro es: " + volumenCilindro );

        scanner.close();
        
    }
    
}
