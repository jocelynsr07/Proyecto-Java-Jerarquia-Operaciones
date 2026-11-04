package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Aprobación de Préstamo Hipotecario");

        System.out.println("Ingresa el sueldo mensual: ");

        double sueldoMensual=scanner.nextDouble();

        System.out.println("Ingresa los años de antiguedad laboral: ");

        int antiguedad=scanner.nextInt();

        System.out.println("Ingresa el monto de deudas actuales: ");

        double deudasActuales=scanner.nextDouble();

        boolean apruebaPrestamo= (sueldoMensual>15000) && (antiguedad>3) && (deudasActuales<3000);

        System.out.println("¿Se aprueba el préstamo hipotecario? " + apruebaPrestamo);

        scanner.close();
        
    }
    
}
