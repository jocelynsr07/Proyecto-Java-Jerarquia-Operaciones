package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Desglose de Moneda (Cambio en Monedas de $10 y $1)");

        System.out.println("Ingresa una cantidad entera de cambio en pesos: ");

        int cambioPesos=scanner.nextInt();

        int monedas10=cambioPesos/10;

        int monedas1=cambioPesos%10;

        System.out.println("El cambio solicitado se entregara en: " + monedas10 + " monedas de 10 pesos " + monedas1 + " monedas de 1 peso");

        scanner.close();
        
    }
    
}
