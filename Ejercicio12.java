package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Verificación de Presupuesto Exacto");

        System.out.println("Ingresa el precio del 1er articulo: ");

        double precio1=scanner.nextDouble();

        System.out.println("Ingresa el precio del 2do articulo: ");

        double precio2=scanner.nextDouble();

        System.out.println("Ingresa el precio del 3er articulo: ");

        double precio3=scanner.nextDouble();

        System.out.println("Ingresa el monto de dinero disponible: ");

        double dineroDisponible=scanner.nextDouble();

        double totalArticulos=precio1+precio2+precio3;

        boolean presupuesto=totalArticulos<=dineroDisponible;

        System.out.println("¿El dinero disponible alcanza para el total de la compra? " + presupuesto );

        scanner.close();
        
    }
    
}
