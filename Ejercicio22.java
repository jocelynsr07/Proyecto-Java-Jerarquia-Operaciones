package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Múltiplo Simultáneo de 4 y 6");

        System.out.println("Ingresa un valor entero: ");

        int numEntero=scanner.nextInt();

        boolean multiploSimultaneo=(numEntero%4 == 0) && (numEntero%6 == 0);

        System.out.println("¿El número ingresado es Múltiplo Simultáneo de 4 y 6? " + multiploSimultaneo);

        scanner.close();
        
    }
    
}
