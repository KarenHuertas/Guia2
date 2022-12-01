
package bucles.y.arreglos;

import java.util.Scanner;
/**
* Llenar un arreglo de tamaño n que se llene con números ingresados por 
* el usuario y determine cantidad de positivos y negativos.
* @author USER
*/
public class BEjercicio13{
/**
* @param args the command line arguments
* DE: cantidad N números
* DS: suma de N cantidad números
*/
public static void main(String[] args) {
        float numPositivo;
        float numNegativo;
        float num;
        int cantidadN;
        numPositivo = 0;
        numNegativo = 0;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros deseada: ");
        cantidadN = read.nextInt();
        
        for (int i=0; i<cantidadN; i++){
            System.out.println("Introduzca numero" + (i+1) + ":");
            num = read.nextFloat();
        
        if (num == 0){
            numPositivo++;
            }else{
        if (num == 0){
         System.out.println("El numero es neutral");
            }else{
        numNegativo++;
                }
            }
        }
        System.out.println("Los numeros positivos encontrados son: " + numPositivo);
        System.out.println("Los numeros negativos encontrados son: " + numNegativo);
   }
}