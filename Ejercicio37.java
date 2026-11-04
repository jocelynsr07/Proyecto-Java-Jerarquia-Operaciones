package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Cálculo de Utilidad Comercial");

        System.out.println("Ingresa el costo de venta: ");

        double costodeVenta=scanner.nextDouble();

        System.out.println("Ingresa el precio de venta: ");

        double preciodeVenta=scanner.nextDouble();

        double margenGanancia=(preciodeVenta-costodeVenta)/costodeVenta;

        boolean utilidadComercial=margenGanancia>=0.30;

        System.out.println("¿La utilidad comercial es mayor o igual a 30%? " + utilidadComercial);

        scanner.close();
        
    }
    
}
