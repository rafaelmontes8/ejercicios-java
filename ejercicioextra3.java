import java.util.Scanner;
public class ejercicioextra3 {
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    int clave;
    do {
        System.out.println("Intenta adivinar el numero (este es entero):\n");
        clave = escanerEntrada.nextInt();
        if (clave == 5) {
          System.out.print("!Ehnorabuena, has acertado¡\n");

        } else {
          System.out.print("Lo siento, ese no es el numero, vuelve a intentarlo\n");
        }  
    } while (clave != 5);
  }
}
