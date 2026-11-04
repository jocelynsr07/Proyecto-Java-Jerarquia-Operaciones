package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Número Terminado en Cero");

        System.out.println("Ingresa un número entero: ");

        int num=scanner.nextInt();

        boolean terminacionCero=num%10==0;

        System.out.println("¿El número ingresado termina en cero? " + terminacionCero);

        scanner.close();
        
    }
    
}
