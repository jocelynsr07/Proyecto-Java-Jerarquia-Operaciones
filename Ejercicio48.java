package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio48 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Simulación de Interruptor Escalonado");

        System.out.println("Ingresa el estado del 1er sensor (1 encendido o 0 apagado): ");

        int primerSensor=scanner.nextInt();

        System.out.println("Ingresa el estado del 2do sensor (1 encendido o 0 apagado): ");

        int segundoSensor=scanner.nextInt();

        System.out.println("Ingresa el estado del 3er sensor (1 encendido o 0 apagado): ");

        int tercerSensor=scanner.nextInt();

        boolean todosEncendidos=(primerSensor==1) && (segundoSensor==1) && (tercerSensor==1);

        System.out.println("¿Los tres sensores están encendidos al mismo tiempo? " + todosEncendidos);

        scanner.close();
        
    }
    
}
