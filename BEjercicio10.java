
package bucles.y.arreglos;

import java.util.Scanner;
/**
 *.Llenar un arreglo de tamaño n,este tamaño debe ser impar, y el contenido del
 * arreglo deben ser los números pares partiendo de 2.
 * @author USER
 */
public class BEjercicio10 {

    /**
     * @param args the command line arguments
     * DE: numero impar
     * DS: numeros pares desde el 2
     */
    public static void main(String[] args) {
        int cantidadN;
        int[] vector;
        vector = new int[100];
        Scanner read = new Scanner(System.in);

        System.out.println("de que tamaño queres? (solo impar): ");
        cantidadN = read.nextInt();

        if (cantidadN % 2 == 0){
           System.out.println("Solo se puede impar");
         } else {
           for (int i=1; i<=cantidadN; i++){
             vector[i] = (i+i);
             System.out.println(vector[i]);
           }
        }
    }
}