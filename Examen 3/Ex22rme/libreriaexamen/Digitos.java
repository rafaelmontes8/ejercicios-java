/*
 * @author Rafael Montes Expósito
 * Opción A
 * Esta funcion me dice los digitos de un numero
 */
package libreriaexamen;

public class Digitos {
  public static long digitos (long numero) { 
    int contador=0;
    do {
        numero /=10;
        contador++;
    } while (numero>0);
    return contador;
  }
}
