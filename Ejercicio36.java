package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Cobro de Envío a Domicilio");

        System.out.println("Ingresa el subtotal de la compra: ");

        double subtotalCompra=scanner.nextDouble();

        System.out.println("Ingresa la distancia en km: ");

        double distanciakm=scanner.nextDouble();

        boolean envioGratis=(subtotalCompra>800) || (distanciakm<3);

        System.out.println("¿La compra tiene envío gratis? " + envioGratis);

        scanner.close();
        
    }
    
}
