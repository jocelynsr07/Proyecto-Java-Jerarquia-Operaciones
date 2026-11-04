package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Pertenencia a Rango Abierto (15, 85)");

        System.out.println("Ingresa un valor decimal: ");

        double x=scanner.nextDouble();

        boolean perteneceRango=(x>15) && (x<85);

        System.out.println("¿El valor ingresado se encuentra dentro del rango de 15 a 85? " + perteneceRango);

        scanner.close();
        
    }
    
}
