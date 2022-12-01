
package bucles.y.arreglos;

import java.util.Scanner;
/**
 * Realizar un programa que lea un número y determine si es un número primo.
 * @author USER
 */
public class BEjercicio1 {

    /**
     * @param args the command line arguments
     * DE: número
     * DS: número primo
     */
    public static void main(String[] args) {
        int num;
        int contador;
        contador = 0;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        num = read.nextInt();

        for(int i=1; i<=num; i++){
          if (num%i == 0){
            contador++;
                }
            }
        
        if (contador <= 2){     
            System.out.println("es primo");
            }else{
                System.out.println("no es primo");          
        }
    }
}