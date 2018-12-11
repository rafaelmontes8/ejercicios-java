import java.util.Scanner;
public class TresEnRaya {
  public static void main ( String[] args ) {
    int[][] tablero=new int[3][3];
    boolean finPartida=false;
    Scanner s=new Scanner(System.in);
     System.out.println("Juguemos al 3 en raya(empiezas tu, introduce primero fila y luego columna):");
    do {
      System.out.println(tablero[0][0]+" | "+tablero[0][1]+  " | "+tablero[0][2]);
      System.out.println(tablero[1][0]+" | "+tablero[1][1]+  " | "+tablero[1][2]);
      System.out.println(tablero[2][0]+" | "+tablero[2][1]+  " | "+tablero[2][2]);
      String jugadaHumano=s.nextLine();
      int jugadaHumanoFila=((int)(jugadaHumano.charAt(0)-48))-1;
      int jugadaHumanoColumna=((int)(jugadaHumano.charAt(1)-48))-1;
      tablero[jugadaHumanoFila][jugadaHumanoColumna]=1;
      int jugadaIaFila;
      int jugadaIaColumna;
      boolean pintar=false;
      do {                              //Aqui metemos la IA
        jugadaIaFila=(int)(Math.random()*3);
        jugadaIaColumna=(int)(Math.random()*3);
        if (tablero[jugadaIaFila][jugadaIaColumna]==0){
          tablero[jugadaIaFila][jugadaIaColumna]=2;
          pintar=true;
        }
      } while (false == pintar);
      if (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1 ||
          tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1 ||
          tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1 ||
          tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1 ||
          tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1 ||
          tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1 ||
          tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1 ||
          tablero[2][0] == 1 && tablero[1][1] == 1 && tablero[0][2] == 1) {
      finPartida=true;
      System.out.println("Ehnorabuena, has ganado");
      } else if (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2 ||
        tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2 ||
        tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2 ||
        tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2 ||
        tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2 ||
        tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2 ||
        tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2 ||
        tablero[2][0] == 2 && tablero[1][1] == 2 && tablero[0][2] == 2){
        System.out.println("Has perdido, mas suerte la proxima");
        finPartida=true;
      }
      
    } while (finPartida!=true);
  }
}
