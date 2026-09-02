package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICAS;

import java.util.Scanner;

public class EstadisticaModular {
    public static double promedio(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10){
        double suma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
        return suma / 10;
    }
    public static double desviacion(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10){
        double media = promedio(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        double suma = 0;
        suma = suma + Math.pow(n1 - media, 2);
        suma = suma + Math.pow(n2 - media, 2);
        suma = suma + Math.pow(n3 - media, 2);
        suma = suma + Math.pow(n4 - media, 2);
        suma = suma + Math.pow(n5 - media, 2);
        suma = suma + Math.pow(n6 - media, 2);
        suma = suma + Math.pow(n7 - media, 2);
        suma = suma + Math.pow(n8 - media, 2);
        suma = suma + Math.pow(n9 - media, 2);
        suma = suma + Math.pow(n10 - media, 2);
        return Math.sqrt(suma / 9);
    }
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        b.useLocale(java.util.Locale.US);
        System.out.println("Ingrese las variables: ");
        double n1 = b.nextDouble();
        double n2 = b.nextDouble();
        double n3 = b.nextDouble();
        double n4 = b.nextDouble();
        double n5 = b.nextDouble();
        double n6 = b.nextDouble();
        double n7 = b.nextDouble();
        double n8 = b.nextDouble();
        double n9 = b.nextDouble();
        double n10 = b.nextDouble();
        double media = promedio(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        double desviacionEstandar = desviacion(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        System.out.println("El promedio es: " + media);
        System.out.println("La desviacion es: "+ desviacionEstandar);

    }

}


