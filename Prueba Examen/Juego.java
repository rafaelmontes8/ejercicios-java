/*
* @author Rafael Montes Expósito
* El programa implementa el juego de piedra, papel y tijeras.
*/
import java.util.Scanner;
public class Juego {
  public static void main( String[] args ) {
    Scanner s= new Scanner(System.in);
    System.out.println("Introduce el numero de rondas que quieres jugar:");
    int rondas=s.nextInt();
    int victoriasJugador=0;
    for (int i=0;i<rondas;i++) {
      boolean ganar=false;
      System.out.println("Elije piedra(1), papel(2) o tijeras(3):");
      int seleccion=s.nextInt();
      int seleccionMaquina=(int)(Math.random()*3+1);
      switch(seleccion){
        case 1:
          if(seleccionMaquina==3){
            ganar=true;
            System.out.println("has ganado la ronda");
          } else if(seleccionMaquina==1){
            System.out.println("habeis empatado en la ronda");
          } else if(seleccionMaquina==2) {
            System.out.println("Pierdes la ronda");
          }
        break;
        case 2:
          if(seleccionMaquina==1){
            ganar=true;
            System.out.println("has ganado la ronda");
          } else if(seleccionMaquina==2){
            System.out.println("habeis empatado en la ronda");
          } else if(seleccionMaquina==3) {
            System.out.println("Pierdes la ronda");
          }
        break;
        case 3:
          if(seleccionMaquina==2){
            ganar=true;
            System.out.println("has ganado la ronda");
          } else if(seleccionMaquina==3){
            System.out.println("habeis empatado en la ronda");
          } else if(seleccionMaquina==1) {
            System.out.println("Pierdes la ronda");
          }
        break;
      }
      if (ganar==true){
        victoriasJugador++;
      }
    }
    if (victoriasJugador>rondas/2){
    System.out.println("Ehnorabuena, has ganado, por que has ganado "+victoriasJugador+" rondas");
    } else if (victoriasJugador==(rondas/2)){
      System.out.println("Casi, has empatado");
    } else if (victoriasJugador<(rondas/2)){
      System.out.println("Mejor suerte la proxima, has perdido");
    }
  }
}