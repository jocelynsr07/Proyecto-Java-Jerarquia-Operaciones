package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Evaluación de Comisión de Ventas");

        System.out.println("Ingresa el total de ventas mensuales: ");

        double totalVentas=scanner.nextDouble();

        boolean bonoEspecial=totalVentas>=20000;

        System.out.println("¿El empleado obtiene un bono especial? " + bonoEspecial);
        
        scanner.close();
        
    }
    
}
