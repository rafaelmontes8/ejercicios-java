/*
 * @author Rafael Montes Expósito
 * 16-01-2019
 *  
 * de discos indicado como argumento + 1. Inicializa 
 * la primera fila (poste) con todos los discos, y el resto de filas sin discos.

 * 
 */
package libreriaHanoi;
public class InicializaPostes {
  public static int[][] inicializapostes(int [][] tablero,int aux) {
    int relleno=1;
    for(int i=0;i<aux;i++){
      tablero[0][i]=relleno;
      relleno++;
    }
  return tablero;
  }
}

