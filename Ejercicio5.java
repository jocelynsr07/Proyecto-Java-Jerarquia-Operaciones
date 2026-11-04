package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Cálculo de Salario Neto Secuencial");

        System.out.println("Ingresa las horas trabajadas: ");

        double horasTrabajadas=scanner.nextDouble();

        System.out.println("Ingresa el costo por hora: ");

        double costoPorHora=scanner.nextDouble();

        double sueldoBruto=horasTrabajadas*costoPorHora;

        double retImpuesto=12;

        double seguroFijo=150;

        double salarioNeto=(sueldoBruto*(1-(retImpuesto/100)))-seguroFijo;

        System.out.println("El Salario Neto Final es de: " + salarioNeto + " pesos");

        scanner.close();
        
    }
    
}
