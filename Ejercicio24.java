package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Pertenencia a Al Menos Un Rango");

        System.out.println("Ingresa un número entero: ");

        int numE=scanner.nextInt();

        boolean pertRango=(numE >= 1 && numE <= 10) || (numE >=50 && numE <= 60);

        System.out.println("¿El número se encuentra dentro del rango de 1 a 10 o de 50 a 60? " + pertRango);

        scanner.close();
        
    }
    
}
