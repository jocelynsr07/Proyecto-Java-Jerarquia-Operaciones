package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Descuento por Compra Voluminosa");

        System.out.println("Ingresa la cantidad de unidades compradas: ");

        int unidadesCompradas=scanner.nextInt();

        System.out.println("Ingresa el precio unitario: ");

        double precioUnitario=scanner.nextDouble();

        double costoTotal=unidadesCompradas*precioUnitario;

        boolean obtieneDescuento=(unidadesCompradas>50) && (costoTotal>5000);

        System.out.println("¿Obtiene descuento por compra voluminosa? " + obtieneDescuento);

        scanner.close();
        
    }
    
}
