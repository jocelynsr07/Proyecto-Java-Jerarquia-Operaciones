package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Cobro de Estacionamiento Fraccionado");

        System.out.println("Ingresa los minutos totales del estacionamiento: ");

        int minutosTotales=scanner.nextInt();

        int tHoras=minutosTotales/60;

        int fraccionHora=minutosTotales%60;

        int costoHoraoFraccion=25;

        int totalaPagar=(tHoras*25) + (fraccionHora>0? costoHoraoFraccion:0);

        System.out.println("El total a pagar es: " + totalaPagar + " pesos. ");

        scanner.close();
        
    }
    
}
