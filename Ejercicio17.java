package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Verificación de Velocidad Máxima");

        System.out.println("Ingresa la velocidad registrada del vehiculo: ");

        double veloc=scanner.nextDouble();

        boolean excedeVelocidad=veloc>110;

        System.out.println("¿Se excede el límite permitido en autopista de 110.0 km/h? " + excedeVelocidad);

        scanner.close();
        
    }
    
}
