
package bucles.y.arreglos;
import java.util.Scanner;
/**
 * La conjetura de Ulam afirma que dado un entero y siguiendo los pasos 
 * siguientes siempre obtenemos un 1.
 * Si el número es par se divide por 2.
 * Si es impar se multiplica por 3 y se suma 1.
 * Escribe un programa que le pida al usuario un número entero
 * y que compruebe si la conjetura de Ulam es cierta,
 * el programa deberá escribir toda la secuencia hasta llegar al uno.
 * @author USER
 */
public class BEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num;
         
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca numero: ");
        num = read.nextInt();

        while (num != 1){
          if (num % 2 ==0){
            num = (num/2);
            System.out.println(num);
          } else {
            num = ((num*3)+1);
            System.out.println(num);
      }
    }
  }
}