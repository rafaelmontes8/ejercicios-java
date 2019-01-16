/*Fecha: 12-12-2018
 * 
 *@author Rafael Montes Expósito
 *  
 * Descripción
 * Implemente el juego del tres en raya para dos jugadores. El juego terminará cuando uno de los
 * jugadores haya conseguido poner en línea tres de sus fichas, o cuando ya no sea posible realizar ninguna
 * línea de tres fichas (por parte de ambos jugadores), informando convenientemente al usuario del motivo del fin
 * del juego: gana uno de los jugadores -indicando quién- o empate. El programa irá solicitando reiterada y
 * alternativamente a cada jugador la posición (fila, columna) donde quiere colocar la ficha. Si la posición está
 * ocupada, el programa debe volver a solicitar al mismo jugador una nueva posición, advirtiéndosele que la
 * casilla estaba ocupada.
*/
 


import java.util.Scanner;
public class Ex20rme2b {
  public static void main ( String[] args ) {
    int[][] tablero=new int[3][3];
    boolean finPartida=false;
    Scanner s=new Scanner(System.in);
     System.out.println("Juguemos al 3 en raya(empieza el jugador 1, introduce primero fila y luego columna juntos):");
    do {
      tablero(tablero);
      String jugadaHumano;          
      int jugadaJugador1Fila;
      int jugadaJugador1Columna;
      int jugadaJugador2Fila;
      int jugadaJugador2Columna;
      boolean pintar1=false;
      boolean pintar2=false;
      do {                              //Aqui metemos la jugada del jugador 1
        jugadaHumano=s.nextLine();
        jugadaJugador1Fila=((int)(jugadaHumano.charAt(0)-48))-1;
        jugadaJugador1Columna=((int)(jugadaHumano.charAt(1)-48))-1;
        if (tablero[jugadaJugador1Fila][jugadaJugador1Columna]==0){
          tablero[jugadaJugador1Fila][jugadaJugador1Columna]=1;
          pintar1=true;
        }
      } while (false == pintar1);
      tablero(tablero);
      
      do {                              //Aqui metemos la jugada del jugador 2
        jugadaHumano=s.nextLine();
        jugadaJugador2Fila=((int)(jugadaHumano.charAt(0)-48))-1;
        jugadaJugador2Columna=((int)(jugadaHumano.charAt(1)-48))-1;
        if (tablero[jugadaJugador2Fila][jugadaJugador2Columna]==0){
          tablero[jugadaJugador2Fila][jugadaJugador2Columna]=2;
          pintar2=true;
        }
      } while (false == pintar2);
      tablero(tablero);
      if (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1 ||
          tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1 ||
          tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1 ||
          tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1 ||
          tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1 ||
          tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1 ||
          tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1 ||
          tablero[2][0] == 1 && tablero[1][1] == 1 && tablero[0][2] == 1) {
      finPartida=true;
      System.out.println("Ehnorabuena, ha ganado el jugador 1");
      } else if (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2 ||
        tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2 ||
        tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2 ||
        tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2 ||
        tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2 ||
        tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2 ||
        tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2 ||
        tablero[2][0] == 2 && tablero[1][1] == 2 && tablero[0][2] == 2){
        System.out.println("Ehnorabuena, ha ganado el jugador 2");
        tablero(tablero);
        finPartida=true;
      } else if (tablero[0][0] != 0 && tablero[0][1] != 0 && tablero[0][2] != 0 &&
        tablero[0][0] != 0 && tablero[1][1] != 0 && tablero[2][2] != 0 &&
        tablero[0][0] != 0 && tablero[1][0] != 0 && tablero[2][0] != 0 &&
        tablero[0][1] != 0 && tablero[1][1] != 0 && tablero[2][1] != 0 &&
        tablero[0][2] != 0 && tablero[1][2] != 0 && tablero[2][2] != 0 &&
        tablero[1][0] != 0 && tablero[1][1] != 0 && tablero[1][2] != 0 &&
        tablero[2][0] != 0 && tablero[2][1] != 0 && tablero[2][2] != 0 &&
        tablero[2][0] != 0 && tablero[1][1] != 0 && tablero[0][2] != 0) {
        tablero(tablero);
        System.out.println("La partida ha acabado en empate");
        finPartida=true;
      }
      
    } while (finPartida!=true);
  }
  public static void tablero (int [][] tablero) {
      System.out.println("   1   2   3");
      System.out.println("1  "+tablero[0][0]+" | "+tablero[0][1]+  " | "+tablero[0][2]);
      System.out.println("2  "+tablero[1][0]+" | "+tablero[1][1]+  " | "+tablero[1][2]);
      System.out.println("3  "+tablero[2][0]+" | "+tablero[2][1]+  " | "+tablero[2][2]);
  }
}
