package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Número Impar Negativo");

        System.out.println("Ingresa un número entero: ");

        int ent=scanner.nextInt();

        boolean imparNegativo=(ent<0) && (ent%2 != 0);

        System.out.println("¿El número ingresado es impar negativo? " + imparNegativo);

        scanner.close();
        
    }
    
}
