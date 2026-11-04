package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio43 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Verificación de Bisiesto con Regla Completa");

        System.out.println("Ingresa un año: ");

        int anio=scanner.nextInt();

        boolean esBisiesto=(anio%4 == 0 && anio%100 != 0) || (anio%400 == 0);

        System.out.println("¿Es año bisiesto? " + esBisiesto);

        scanner.close();
        
    }
    
}
