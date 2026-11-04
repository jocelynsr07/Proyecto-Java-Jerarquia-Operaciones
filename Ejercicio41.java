package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio41 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Orden Creciente Estricto de Tres Números");

        System.out.println("Ingresa un valor entero para a: ");

        int a1=scanner.nextInt();

        System.out.println("Ingresa un valor entero para b: ");

        int b1=scanner.nextInt();

        System.out.println("Ingresa un valor entero para c: ");

        int c1=scanner.nextInt();

        boolean estanOrdenados=a1<b1 && b1<c1;

        System.out.println("¿Los valores se encuentran ordenados de manera creciente?" + estanOrdenados);

        scanner.close();
        
    }
    
}
