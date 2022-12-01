
package bucles.y.arreglos;

import java.util.Scanner;

/**
 *Realizar un programa que calcule los primeros 10 números 
 *de la sucesión Fibonacci.
 * 
 */
public class BEjercicio2 {

    /**
     * DE: numero
     * DS: sucesion fibonacci
     */
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[100];
        int num1;
        int num2;
        num1 = 1;
        num2 = 0;
        
        for (int i = 0; i<100; i++){
            myArray[i] = num2;
            num1 += num2;
            num2 = num1-num2;
             }
        for (int i=0; i<10; i++){
        System.out.println(myArray[i]);
             }
    }
}
