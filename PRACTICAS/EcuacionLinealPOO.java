package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICAS;

import java.util.Scanner;

// 2. Algebra: ecuacion lineal 2 x 2. 
// Diseñe la clase EcuacionLineal para un sistema de ecuaciones de 2 x 2
//                          ax + by = e
//                          cx + dy = f
//        x = ed − bf / ad − bc    y =  af − ec / ad − bc
// La clase contiene:
// a) Los atributos privados a, b, c, d y f.
// b) Un constructor para los argumentos para a, b, c, d y f.
// c) Un metodo tieneSolucion() que devuelve true si ad − bc no es cero.
// d) Dos metodos getX() y getY() que retornan la solucion de la ecuacion
// Dibuje el diagrama UML de la clase e implem´entela. Escriba un programa de prueba
// (Test) que solicite al usuario ingresar a, b, c, d, e y f y muestre el resultado. Si ad − bc es
// 0, indique que ”La ecuacion no tiene solucion”.
// Ejemplo de entrada
// Ingrese a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
// Ingrese a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
// Ejemplo de salida
// x = -2.0, y = 3.0
// La ecuacion no tiene solucion
class EcuacionLineal{
    // ATRIBUTOS 
    private double a, b, c, d, e, f;
    public EcuacionLineal(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public boolean tieneSolucion(){
        if (a*d - b*c != 0 ) {
            return true;
        } else {
            return false;
        }
    } 
    public double getX(){
        return (e*d - b*f) / (a*d - b*c);
    }
    public double getY(){
        return (a*f - e*c) / (a*d - b*c);
    }
}
public class EcuacionLinealPOO {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        dato.useLocale(java.util.Locale.US);
        System.out.println("Ingrese las variables a, b, c, d, e, f: ");
        double a = dato.nextDouble();
        double b = dato.nextDouble();
        double c = dato.nextDouble();
        double d = dato.nextDouble();
        double e = dato.nextDouble();
        double f = dato.nextDouble();
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);
        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX() + 
                               ", y = " + ecuacion.getY());
        } else {
            System.out.println("No tiene solucion");
        }
    } 
}
