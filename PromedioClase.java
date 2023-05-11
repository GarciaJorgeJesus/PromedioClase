
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
import java.util.Scanner;

public class PromedioClase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int NUM_CALIFICACIONES = 10;
        int total = 0;
        int calificacion;
        
        for (int i = 1; i <= NUM_CALIFICACIONES; i++) {
            System.out.print("Escriba la calificacion: ");
            calificacion = entrada.nextInt();
            total += calificacion;
        }
        
        int promedio = total / NUM_CALIFICACIONES;
        
        System.out.printf("%nEl total de las %d calificaciones es %d%n", NUM_CALIFICACIONES, total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    }
}
