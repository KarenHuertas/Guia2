
package bucles.y.arreglos;
/**
 *Realice algoritmo que genere las siguiente sucesion hasta los 10 
 *primeros numeros:5 15 45 135 405 1215...
 */
public class BEjercicio6 {

    /**
     * DE: 10 primeros numeros 
     *  1	5
     *  2 	15
     *  3	45
     *  4	135
     *  5	405
     *  6	1215
     *  7	3645
     *  8	10935
     *  9        32805
     *  10	98412
     * DS: sucesión de los 10 números * 3
     */
    public static void main(String[] args) {
        // DECLARAR VARIABLES
 
        int resultado = 5;

        for (int i=0; i<10; i++){
            System.out.println(resultado);
            resultado = (resultado*3);
        }
    }
}
