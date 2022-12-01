
package bucles.y.arreglos;

/**
 * Llenar un arreglo con los primeros 100 números pares y muestre la suma de los 
 * elementos del arreglo.
 * @author USER
 */
public class BEjercicio12 {

    /**
     * @param args the command line arguments
     * DE: primeros 100 numeros pareas
     * DS: primeros 100 numeros pares y la suma
     */
    public static void main(String[] args) {
        int suma;
        int[] vector;
        vector = new int[101];
        suma = 0;

        for (int i=1; i<=100; i++){
           vector[i] = (i+i);
           System.out.println(vector[i]);
           suma += vector[i];
         }
        System.out.println("\nEl resultado de la suma es: "+suma);
    }
}