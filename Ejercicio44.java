package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio44 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Distancia de Manzana a Frontera de Matriz");

        System.out.println("Ingresa la coordenada X: ");

        int coordenadaX=scanner.nextInt();

        System.out.println("Ingresa la coordenada Y: ");

        int coordenadaY=scanner.nextInt();

        boolean primerCuadrante=(coordenadaX>0)&&(coordenadaY>0);

        System.out.println("¿Las coordenadas del punto X,Y se encuentran dentro del primer cuadrante? " + primerCuadrante);

        scanner.close();
        
    }
    
}
