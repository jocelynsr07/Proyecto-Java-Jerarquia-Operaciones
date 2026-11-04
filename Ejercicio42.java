package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Detección de Dígitos Iguales en Número de 2 Cifras");

        System.out.println("Ingresa un número de dos digitos entre 10 y 99: ");

        int dosCifras=scanner.nextInt();

        int decenas=dosCifras/10;

        int unidades=dosCifras%10;

        boolean digitosIguales=decenas==unidades;

        System.out.println("¿Los digitos de las decenas y de las unidades son iguales? " + digitosIguales);

        scanner.close();
        
    }
    
}
