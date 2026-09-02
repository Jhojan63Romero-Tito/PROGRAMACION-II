package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICAS;
// LABORATORIO Nª 1
// EL OBJETIVO PRINCIPAL DE ESTE LABORATORIO ES ESCRIBIR EL PRIMER PROGRAMA ORIENTADO A OBJETOS EN JAVA
// PROBLEMA: DISEÑAR UNA CLASE LLAMADA "CRONOMETRO"
// a) Los atributos privados inicia y finaliza con metodos getter.
// b) Un constructor sin argumentos que inicialica inicia con la hora actual.
// c) Un metodo llamado inicia() que restablece inicia a la hora actual.
// d) Un metodo llamado detener() que establece finaliza a la hora actual.
// e) Un metodo llamado lapsoDeTiempo() que retorna el tiempo transcurrido del
// cronometro en milisegundos.
// LABORATORIO 1 TIENE Q ESTAR IMPRESO Y ASI 
class Cronometro{
    // ATRIBUTOS
   private long inicia;
   private long finaliza;
   public Cronometro(){
    inicia = System.currentTimeMillis();
   }
   public long getInicia(){
    return inicia;
   }
   public long getFinaliza(){
    return finaliza;
   }
   public void inicia(){
    inicia = System.currentTimeMillis();
   }
   public void detener(){
    finaliza = System.currentTimeMillis();
   }
   public long lapsoDeTiempo(){
    return finaliza - inicia;
   }
} 

public class CronometroPOO{
    public static void main(String[] args) {
       int[] numero = new int[100000];
       
       for(int i = 0 ; i < 100000 ; i++){
        numero[i] = (int)(Math.random() * 100000);
       }
       Cronometro c = new Cronometro();
       c.inicia();
        for(int i = 0 ; i < 99999 ; i++ ){
            int menor = i;
            for(int j = i + 1 ; j < 100000 ; j++ ){
                if (numero[j] < numero[menor]) {
                    menor = j;
                }
            }
            int aux = numero[i]; 
            numero[i] = numero[menor]; 
            numero[menor] = aux;
       }
       c.detener(); 
       System.out.println("Tiempo de Ejecucion: " 
                + c.lapsoDeTiempo() 
                + " milisegundos");
    }

}

