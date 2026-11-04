package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Evaluación de Deuda Acumulada");

        System.out.println("Indica el ingreso mensual: ");

        double ingresoMensual=scanner.nextDouble();

        System.out.println("Indica el pago de tarjeta de crédito: ");

        double pagoTarjeta=scanner.nextDouble();

        boolean deudaAcumulada=pagoTarjeta>(0.30*ingresoMensual);

        System.out.println("¿El pago de la tarjeta supera el 30% del ingreso mensual? " + deudaAcumulada);

        scanner.close();
        
    }
    
}
