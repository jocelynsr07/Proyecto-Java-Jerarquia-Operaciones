package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Cálculo de Rendimiento Bancario Bruto");

        System.out.println("Ingresa el monto de inversión: ");

        double montoInversion=scanner.nextDouble();

        System.out.println("Ingresa los dias de plazo: ");

        int plazo=scanner.nextInt();

        double tasaFija=9.5;

        double rendimientoGanado=montoInversion*(tasaFija/36000*plazo);

        System.out.println("El rendimiento bruto ganado es de: " + rendimientoGanado);

        scanner.close();
        
    }
    
}
