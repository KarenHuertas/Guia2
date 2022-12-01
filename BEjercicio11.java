
package bucles.y.arreglos;

/**
 * Llenar un arreglo con los primeros 100 números de la sucesión Fibonacci
 * 0,1,1,2,3,5,8,13................
 * @author USER
 */
public class BEjercicio11 {

    /**
     * @param args the command line arguments
     * DE: primeros 100 numeros sucesión Fibonacci
     * DS: primeros 100 numeros sucesión Fibonacci
     */
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[100];

        int num1; 
        int num2; 
        num1 = 1; 
        num2 = 0; 

        for (int i = 0; i <100; i++){ 
            myArray[i] = num2; 
            num1 += num2; 
            num2 = num1-num2; 
                } 
        for (int i=0; i <100; i++){ 
            System.out.println(myArray[i]); 
        } 
     }
}