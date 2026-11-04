package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Acceso Preferencial a Evento");

        System.out.println("Ingresa tu edad: ");

        int edadAsistente=scanner.nextInt();

        System.out.println("¿Cuentas con pase VIP (1 para sí, 0 para no)?: ");

        int paseVip=scanner.nextInt();

        boolean accesoPreferencial= (edadAsistente<12) || (paseVip==1);

        System.out.println("¿Tiene acceso preferencial? " + accesoPreferencial);

        scanner.close();
        
    }
    
}
