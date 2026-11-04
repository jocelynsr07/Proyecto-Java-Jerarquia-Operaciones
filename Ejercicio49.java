package ProyectoFinal;

import  java.util.Scanner;

public class Ejercicio49 {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Criterio de Beca Universitaria Integrada");

        System.out.println("Ingresa el promedio académico (0 a 10): ");

        double promedioAcademico=scanner.nextDouble();

        System.out.println("Indica el ingreso familiar mensual: ");

        double ingresoFamiliar=scanner.nextDouble();

        System.out.println("Ingresa el número de hermanos estudiando: ");

        double hermanosEstudiando=scanner.nextDouble();

        boolean obtieneBeca=(promedioAcademico>=9.5) || (ingresoFamiliar<8000 && hermanosEstudiando>2);

        System.out.println("¿Obtiene beca? " + obtieneBeca);

        scanner.close();
        
    }
    
}
