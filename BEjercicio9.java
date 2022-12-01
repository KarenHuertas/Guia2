
package bucles.y.arreglos;
import java.util.Scanner;
/**
 * Llenar un arreglo de tamaño n,
 * y estos elementos sean 1 y 0 alternado e imprimir por consola.
 * @author USER
 */
public class BEjercicio9 {

    /**
     * @param args the command line arguments
     * DE: arreglo tamaño n
     * DS: numero entre 1 y 0 alternados
     */
    public static void main(String[] args) {
        
            int cantidadN;
            int[] vector;
            vector = new int[100];
            Scanner read = new Scanner(System.in);

            System.out.println("Ingrese Cuantas repeticiones desea: ");
            cantidadN = read.nextInt();

           for (int i=0; i<cantidadN;i++){
              if (i % 2 ==0){
                vector[i] = 0;
                System.out.println(vector[i]);
              } else {
                vector[i] = 1;
                System.out.println(vector[i]);
      }
    }
  }
}