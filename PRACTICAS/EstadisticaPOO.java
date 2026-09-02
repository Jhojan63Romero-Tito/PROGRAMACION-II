package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICAS;

import java.util.Scanner;

class Estadistica{
    private double n1, n2, n3, n4, n5, n6, n7, n8, n9,  n10;
    public Estadistica(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.n7 = n7;
        this.n8 = n8;
        this.n9 = n9;
        this.n10 = n10;
    }
    public double promedio(){
        double suma = n1 + n2 + n3 + n4 + n5 
                    + n6 + n7 + n8 + n9 + n10;
        return suma / 10;
    }
    public double desviacion(){
        double suma = 0;
        suma = suma + Math.pow(n1 - promedio(), 2);
        suma = suma + Math.pow(n2 - promedio(), 2);
        suma = suma + Math.pow(n3 - promedio(), 2);
        suma = suma + Math.pow(n4 - promedio(), 2);
        suma = suma + Math.pow(n5 - promedio(), 2);
        suma = suma + Math.pow(n6 - promedio(), 2);
        suma = suma + Math.pow(n7 - promedio(), 2);
        suma = suma + Math.pow(n8 - promedio(), 2);
        suma = suma + Math.pow(n9 - promedio(), 2);
        suma = suma + Math.pow(n10 - promedio(), 2);
        return Math.sqrt(suma / 9); // el 9 por que -> por que n - 1,  si n = 10
    }
}
public class EstadisticaPOO {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        a.useLocale(java.util.Locale.US);
        System.out.println("Ingrese las variables: ");
        double n1 = a.nextDouble();
        double n2 = a.nextDouble();
        double n3 = a.nextDouble();
        double n4 = a.nextDouble();
        double n5 = a.nextDouble();
        double n6 = a.nextDouble();
        double n7 = a.nextDouble();
        double n8 = a.nextDouble();
        double n9 = a.nextDouble();
        double n10 = a.nextDouble();
        Estadistica variable = new Estadistica(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        System.out.println("El promedio es: " +  variable.promedio());
        System.out.println("La desviacion es: " + variable.desviacion());
    }
}

