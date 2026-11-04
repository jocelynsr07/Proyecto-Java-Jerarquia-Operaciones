package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Evaluación de Sobrepeso por IMC");

        System.out.println("Ingresa el peso en kg: ");

        double peso=scanner.nextDouble();

        System.out.println("Ingresa la estatura en metros: ");

        double estatura=scanner.nextDouble();

        double imc=peso/(Math.pow(estatura, 2));

        boolean sobrePeso=imc>=25;

        System.out.println("¿El IMC indica sobrepeso? " + sobrePeso);

        scanner.close();
        
    }
    
}
