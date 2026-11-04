package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio50 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Verificación de Ecuación de Círculo en el Origen");

        System.out.println("Ingresa el valor de x: ");

        double valorX=scanner.nextDouble();

        System.out.println("Ingresa el valor de y: ");

        double valorY=scanner.nextDouble();

        System.out.println("Ingresa el valor radio de la circunferencia: ");

        double r=scanner.nextDouble();

        boolean enOrigen=(Math.pow(valorX, 2))+(Math.pow(valorY, 2))<=Math.pow(r, 2);

        System.out.println("¿El punto cae exactamente sobre la circunferencia o dentro de ella? " + enOrigen);

        scanner.close();
        
    }
    
}
