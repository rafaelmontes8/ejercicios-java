/*
 * @author Rafael Montes Expósito
 * 16-01-2019
 *  Implemente el juego de las Torres de Hanói. 
 * El juego consiste en tres postes verticales. 
 * En uno de los postes se apila un número de discos perforados por 
 * su centro (este dato, la cantidad de discos con los que quiera jugar 
 * el usuario, será solicitado al usuario). Los discos se apilan sobre uno 
 * de los postes en tamaño decreciente de abajo a arriba. No hay dos discos 
 * iguales, y todos ellos están apilados de mayor a menor radio -desde la base 
 * del poste hacia arriba- en uno de los postes, quedando los otros dos 
 * postes vacíos. El juego consiste en pasar todos los discos desde 
 * el poste ocupado (es decir, el que posee la torre inicial) al tercer 
 * poste (que inicialmente está vacío).
 */
import libreriaHanoi.accesorioHanoi;
import java.util.Scanner;
public class Ex22rme1 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int respuesta=0;
    do{
      System.out.print("Introduce la cantidad de discos con los que quieres jugar:");
      respuesta = s.nextInt();
    }while (respuesta<=2||respuesta>=10);
    int [][]tablero=new int[3][respuesta+1];
    respuesta+=1;
    InicializaPostes.inicializapostes(tablero,respuesta);
    accesorioHanoi.muestraTorres(tablero);
  }
}

