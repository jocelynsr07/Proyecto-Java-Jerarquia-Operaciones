package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Aprobación por Examen A O Examen B");

        System.out.println("Ingresa la nota del exámen A (0 a 100): ");

        double notaA=scanner.nextDouble();

        System.out.println("Ingresa la nota del exámen B (0 a 100): ");

        double notaB=scanner.nextDouble();

        boolean apruebaCertificacion=(notaA>=80) || (notaB>=80);

        System.out.println("¿Aprueba la certificación? " + apruebaCertificacion);

        scanner.close();
        
    }
    
}
