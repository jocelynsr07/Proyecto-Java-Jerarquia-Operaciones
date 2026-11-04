package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio38 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Distribución Proporcional de Ganancias");

        System.out.println("Ingresa la aportación del socio A: ");

        double socioA=scanner.nextDouble();

        System.out.println("Ingresa la aportación del socio B: ");

        double socioB=scanner.nextDouble();

        System.out.println("Ingresa la ganancia total: ");

        double gananciaTotal=scanner.nextDouble();

        double aportacionTotal=socioA+socioB;

        double gananciaSocioA=(socioA/aportacionTotal)*gananciaTotal;

        System.out.println("La ganancia para el socio A es de: " + gananciaSocioA);

        scanner.close();
        
    }
    
}
