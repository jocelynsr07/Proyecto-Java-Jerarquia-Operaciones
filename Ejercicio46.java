package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Evaluación de Fecha Válida Simple");

        System.out.println("Ingresa un mes (1 al 12): ");

        int mes=scanner.nextInt();

        System.out.println("Ingresa un día (1 al 31): ");

        int dia=scanner.nextInt();

        boolean fechaValida=(mes>=1 && mes<=12) && (dia>=1 && dia<=31);

        System.out.println("¿La fecha ingresada es válida? " + fechaValida);

        scanner.close();
        
    }
    
}
