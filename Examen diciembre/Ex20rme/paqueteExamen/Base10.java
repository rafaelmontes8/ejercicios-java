/*  Fecha: 12-12-2018
 *  @author Rafael Montes Expósito
 *  
 *  Hacer un programa para visualizar los números curiosos que hay entre el número 2 y un número
 *  introducido desde teclado. Un número es curioso si su cuadrado tiene al propio número como últimas cifras.
 *  Así, el número 25 es curioso ya que su cuadrado es 625, también es curioso 76 porque su cuadrado es 5776
*/
package paqueteExamen;

public class Base10 {
  public static long Base (long numero) { 
    long contador=0;
    do {
        numero /=10;
        contador++;
    } while (numero>0);
    long aux=1;
    for (int i=0;i<contador;i++) {
      aux*=10;
    }
    aux/=10;
    return aux;
  }
}
