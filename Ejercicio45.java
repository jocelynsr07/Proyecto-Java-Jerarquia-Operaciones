package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio45 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Suma de Dígitos de un Número de 3 Cifras");

        System.out.println("Ingresa un número entero de 3 cifras: ");

        int numer=scanner.nextInt();

        int centenas=numer/100;

        int decen=(numer/10)%10;

        int unidad=numer%10;

        int tresDigitos=centenas+decen+unidad;

        System.out.println("La suma total de los tres digitos es: " + tresDigitos);

        scanner.close();
        
    }
    
}
