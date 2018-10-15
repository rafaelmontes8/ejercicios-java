import java.util.Scanner;
public class ejercicio7_5 {
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    for (int i=1; i <= 4; i+=1) {
        System.out.println("Introduce la clave de la caja:\n");
        int clave = escanerEntrada.nextInt();
        if (clave == 1234) {
          System.out.print("La caja fuerte se ha abierto satisfactoriamente\n");

        } else {
          System.out.print("Lo siento, esa no es la combinación\n");
        }  
    
    }
  }
}
