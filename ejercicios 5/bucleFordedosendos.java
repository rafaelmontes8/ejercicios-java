
import java.util.Scanner;

public class bucleFordedosendos {
  public static void main (String args[]) {
    int vueltas;
  
    System.out.println("Dime cuantos números quieres que escriba:\n");
  
    Scanner escanerEntrada = new Scanner( System.in );
    vueltas = escanerEntrada.nextInt();
    
    for (int i=1; i <= vueltas; i+=2) {
        System.out.println(i);
    }
 
 
  }
}
