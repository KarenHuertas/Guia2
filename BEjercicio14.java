
package bucles.y.arreglos;
/**
 * La suma de 6 numeros impares consecutivos vale 120. Encontrar dichos números
 */
public class BEjercicio14 {
     /**
     * DE: suma 
     * 6 numeros impares
     * DS: resultado 120 de la suma de los 6 numeros impares
     * 15+ 17+ 19+ 21+ 23+ 25+ =120 (números propuestos del estudiante)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 15;
        int resultado = 0;

        for (int i=0; i<6; i++){
           System.out.println(numero);
           resultado += numero;
           numero += 2;
        } 
        System.out.println(resultado);
    }   
}