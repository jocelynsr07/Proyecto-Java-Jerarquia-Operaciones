package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Conversión de Horas a Días y Horas Sobrantes");

        System.out.println("Ingresa un total de horas (número entero): ");

        int totalHoras=scanner.nextInt();

        int diasCompletos=totalHoras/24;

        int horasAdicionales=totalHoras%24;

        System.out.println("El total de días es: " + diasCompletos + " y " + horasAdicionales + " horas ");

        scanner.close();
        
    }
    
}
