package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Validación de Hora del Día (0 a 23)");

        System.out.println("Ingresa una hora en formato entero de 24 hrs: ");

        int hora=scanner.nextInt();

        boolean validacionHora=(hora>=0) && (hora<=23);

        System.out.println("¿El formato de la hora es válido? " + validacionHora);

        scanner.close();
        
    }
    
}
