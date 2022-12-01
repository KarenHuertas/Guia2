
package bucles.y.arreglos;
/**
 * Realizar un algoritmo que resuelva el siguiente problema: 
 * una progresion geometrica comienza en 1 y tiene razon 2. 
 * Encontrar tres terminos consecutivos (de la sucesión) cuyo producto es: 512
 */
public class BEjercicio8 {
   /**
     * DE: progresion geometrica comienza en 1 y tiene razon 2
     * Encontrar tres terminos consecutivos (de la sucesión)
     * DS:producto es 64*2= 128*2= 256*2= 512
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int termino = 64;
        for (int i=0; i<8; i++){
            System.out.println(termino);
            termino = (termino*2);
        }
    }
}
