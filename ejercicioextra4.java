import java.util.Scanner;
public class ejercicioextra4 {
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    int clave;
    do {
        System.out.println("Intenta adivinar el numero (este es entero):\n");
        clave = escanerEntrada.nextInt();
        if (clave == 5) {
          System.out.print("!Ehnorabuena, has acertado¡\n");

        } else if (clave > 5){
          System.out.print("Lo siento, ese no es el numero, vuelve a intentarlo\n");
          System.out.print("Te has pasado, el numero se encuentra entre el 1 y el 6\n");
        } else if (clave < 5){
          System.out.print("Lo siento, ese no es el numero, vuelve a intentarlo\n");
          System.out.print("El numero es un poco mas grande, entre el 1 y el 6\n");
        }    
    } while (clave != 5);
  }
}
