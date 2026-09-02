package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICAS;
import java.util.Scanner;
// (Algebra: Ecuaciones Cuadraticas) Diseñe la clase EcuacionLineal para la 
// ecuacion cuadratica ax2 + bx + c = 0. La clase contiene:
// a) Los atributos privados a, b y c, que representan a los 3 coeficientes.
// b) Un constructor para los argumentos para a, b y c.
// c) Un metodo getDiscriminante() que develve el discriminante b**2 − 4ac.
// d) Dos metodos getRaiz1() y getRaiz2() que retornan las dos raıces de la ecuacion.


//          r1 = −b + √ (b**2 − 4ac) / 2a    y    r2 = −b − √(b**2 − 4ac) / 2a

// Estos metodos solo son utiles si el discriminante es positivo. Si el discriminante es negativo,
// devuelva 0.
// Dibuje el diagrama UML de la clase e implementela. Escriba un programa de prueba (Test)
// que solicite al usuario introducir los valores de a, b y c, y muestre el resultado segun el
// discriminante. Si el discriminante es positivo, muestre las dos raıces. Si el discriminante
// es 0, muestre la unica raız. De lo contrario, muestre ”La ecuacion no tiene raıces reales”.
// Ejemplo de entrada
// Ingrese a, b, c: 1.0 3 1
// Ingrese a, b, c: 1 2.0 1
// Ingrese a, b, c: 1 2 3
// Ejemplo de salida
// La ecuacion tiene dos raıces -0.381966 y -2.61803
// La ecuacion tiene una raız -1
// La ecuacion no tiene raıces reales
class EcuacionCuadratica{
    // ATRIBUTOS
    private double a;
    private double b;
    private double c;
    public EcuacionCuadratica(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante(){
       return (Math.pow(b, 2) - 4*a*c);
    } 
    public double getRaiz1(){
        return (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }
    public double getRaiz2(){
        return (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }
}

public class EcuacionLineal2POO {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        var.useLocale(java.util.Locale.US);
        System.out.println("Ingrese las variables a, b, c: ");
        double a = var.nextDouble();
        double b = var.nextDouble();
        double c = var.nextDouble(); 
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        if (ecuacion.getDiscriminante() > 0) {
            System.out.println("La ecuacion tiene dos raices " + ecuacion.getRaiz1() + " y " + ecuacion.getRaiz2());   
        } else {
            if (ecuacion.getDiscriminante() < 0) {
                System.out.println("La ecuacion no tiene raices reales");
            } else {
                if (ecuacion.getDiscriminante() == 0) {
                    System.out.println("La ecuacion tiene una raiz: " + ecuacion.getRaiz1());      
                }
            }
        }
    } 
    
}
