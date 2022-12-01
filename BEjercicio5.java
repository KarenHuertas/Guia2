
package bucles.y.arreglos;

import java.util.Scanner;

/**
 * Escribe un programa que calcule la factorial de un numero introducido
 * por teclado
 * Para todo numero natural n, se llama n factorial al producto de todos
 * los enteros entre 1 y n
 * @author USER
 */
public class BEjercicio5 {

    /**
     * @param args the command line arguments
     * DE:numero
     * DS:factorial del numero
     */
    public static void main(String[] args) {
      int num;
      int aux;
      aux = 1;
      
      Scanner read = new Scanner (System.in);
      System.out.print("ingrese un numero");
      num = read.nextInt();
      
      for (int i = 1; i<= num; i++){
        aux = aux * i;
        }
      System.out.println("El factorial del numero" +num+ "es: "+aux);
    }
}