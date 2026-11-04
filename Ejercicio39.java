package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio39 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Calificación de Tarjeta de Crédito Gold");

        System.out.println("Indica el ingreso anual: ");

        double ingresoAnual=scanner.nextDouble();

        System.out.println("Indica el puntuaje crediticio: ");

        double puntuajeCrediticio=scanner.nextDouble();

        boolean tarjetaGold=(ingresoAnual>=300000) && (puntuajeCrediticio>700);

        System.out.println("¿Califica para tarjeta Gold? " + tarjetaGold);

        scanner.close();
        
    }
    
}
