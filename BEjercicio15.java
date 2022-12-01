
package bucles.y.arreglos;
import java.util.Scanner;
/**
 * Generar un vector de tamaño n y se rellene de 0
 * @author USER
 */
public class BEjercicio15 {

    /**
     * @param args the command line arguments
     * DE: cantidad N de ceros
     * DS: cantidad N de ceros
     */
    public static void main(String[] args) {
        int cantidadN;
        int[] vector;
        
        vector = new int[100];
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese cuantos ceros desee: ");
        cantidadN = read.nextInt();

        for (int i=0; i<cantidadN;i++){
           vector[i] = 0;
           System.out.println(vector[i]);
    }
  }
}