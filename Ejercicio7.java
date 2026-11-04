package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Promedio Ponderado de Asignatura");

        System.out.println("Ingresa la nota de Exámenes (equivalente al 40% de la calificación final): ");

        double notaExamenes=scanner.nextDouble();

        System.out.println("Ingresa la nota de Tareas (equivalente al 30% de la calificación final): ");

        double notaTareas=scanner.nextDouble();

        System.out.println("Ingresa la nota de Proyecto (equivalente al 30% de la calificación final): ");

        double notaProyecto=scanner.nextDouble();

        double notaFinal=(notaExamenes*0.40)+(notaTareas*0.30)+(notaProyecto*0.30);

        System.out.println("La nota final de la asignatura es: " + notaFinal );

        scanner.close();
        
    }
    
}
