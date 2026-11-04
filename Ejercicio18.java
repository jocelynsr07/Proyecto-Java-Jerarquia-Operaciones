package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Igualdad de Tres Números");

        System.out.println("Ingresa el 1er número entero: ");

        int n1=scanner.nextInt();

        System.out.println("Ingresa el 2do número entero: ");

        int n2=scanner.nextInt();

        System.out.println("Ingresa el 3er número entero: ");

        int n3=scanner.nextInt();

        boolean igualdadentreSi=(n1==n2)&&(n1==n3)&&(n2==n3);

        System.out.println("¿Los numeros son iguales entre si? " + igualdadentreSi);

        scanner.close();
        
    }
    
}
