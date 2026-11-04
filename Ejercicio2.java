package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Conversión Financiera con Comisión");

        System.out.println("Ingresa la cantidad en dolares: ");

        double cantidadUSD=scanner.nextDouble();

        System.out.println("Ingresa el TC a pesos: ");

        double tipoCambio=scanner.nextDouble();

        System.out.println("Ingresa el porcentaje de comisión fija: ");

        double porcentajeComision=scanner.nextDouble();

        double totalNetoPesos=(cantidadUSD*tipoCambio)*(1-(porcentajeComision/100));

        System.out.println("El total neto en pesos descontando la comisión es: " + totalNetoPesos);

        scanner.close();
        
    }
    
}
