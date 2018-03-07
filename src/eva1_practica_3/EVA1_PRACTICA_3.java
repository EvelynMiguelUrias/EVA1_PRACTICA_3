/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_3;

/**
 *
 * @author Evelyn
 */
/*
GENERAR UNA MATRIZ DE 5 * 5 ENTERIS, LLENAR CON NUMEROS ALEATORIOS ENTRE 1 Y 100 E IMPRIMIR
CREAR UNA COPIA DE LA MATRIZ, PERO EN ORDEN INVERSO 
*/
public class EVA1_PRACTICA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS EL ARREGLO CON NUMEROS ALEATORIOS Y LO IMPRIMIMOS 
        System.out.println("Arreglo");
        int aiArreglos[][] = new int[5][5];
        for (int i = 0; i < aiArreglos.length; i++) {
            for (int j = 0; j < aiArreglos[i].length; j++) {
            aiArreglos[i][j] = (int)(Math.random() * 100);
                System.out.println(aiArreglos[i][j]);
            }
        }
        //CREAMOS LA COPIA DEL ARREGLO 
        System.out.println("Copia del arreglo");
       int aiCopia[][] = new int[5][5];
        for (int i = 0; i < aiArreglos.length; i++) {
            for (int j = 0; j < aiArreglos[i].length; j++) {
               aiCopia[i][j] =aiArreglos[i][j]; 
            }
        }
        //IMPRIMIMOS LA COPIA DEL ARREGLO
        for (int i = 0; i < aiCopia.length; i++) {
            for (int j = 0; j < aiCopia[i].length; j++) {
               System.out.println(aiCopia[i][j]); 
            }
        }
        //IMPRIMOS LA COPIA DEL ARREGLO PERO AHORA INVERSA
        System.out.println("copia inversa");
        for (int i = aiCopia.length -1; i >=0; i--) {
            for (int j = aiCopia[i].length -1; j >=0; j--) {
                System.out.println(aiCopia[i][j]);
            }
        }
    }
}
