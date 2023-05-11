
package promedioclase;
import java.util.Scanner;

/**
 *
 * @author maryse
 * 
 * Ciclo While
 * El método main de la clase PromedioClase (líneas 7 a 31) implementa p el algoritmo para 
 * obtener el promedio de la clase.
 * Éste permite que el usuario introduzca 10 calificaciones para luego calcular 
 * y mostrar el promedio en pantalla.
 * 
 */

public class PromedioClase {

        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int contadorCalificaciones = 1; 
        while (contadorCalificaciones <= 10){
            int calificacion = entrada.nextInt(); 
            total = total + calificacion; 
            contadorCalificaciones = contadorCalificaciones + 1; 
          }   
        int promedio = total / 10; 
        public  void prom (){
            
        System.out.printf("%nEl total de las 10 calificaciones es %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    } 
         public static void main(String[] args) {
        PromedioClase calcular = new PromedioClase();
        calcular.prom();
} 
}