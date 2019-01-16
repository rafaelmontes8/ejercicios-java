/*  Fecha: 12-12-2018
 *  @author Rafael Montes Expósito
 *  
 *  Esta función comprueba si el numero es curioso analizando si el cuadrado contiene al numero original
*/
package paqueteExamen;
public class NumeroCurioso {
  public static Boolean Curioso (long numero,long cuadrado) { 
    Boolean Curioso=false;
    long aux=numero;
    long auxcuadrado=cuadrado%(Base(cuadrado)); 
    if (auxcuadrado==aux) {
      Curioso=true;
    }
    return Curioso;
  }
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
