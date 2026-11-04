package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Rango de Presión Arterial Normal");

        System.out.println("Ingresa la presión sistólica: ");

        int presionArterial=scanner.nextInt();

        boolean presionNormal= (presionArterial>=90) && (presionArterial<=120);

        System.out.println("¿La presión arterial se encuentra dentro del rango saludable de 90 a 120 mmHg? " + presionNormal);

        scanner.close();
        
    }
    
}
