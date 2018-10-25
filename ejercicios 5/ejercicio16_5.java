import java.util.Scanner;
public class ejercicio16_5{
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    System.out.println("introduce un numero y te dire si es primo:");
    int numeroSeleccionado = escanerEntrada.nextInt();
    int i= 2;
    boolean primo = true;
      do {
        if (numeroSeleccionado %i ==0) {
        primo = false;
        }
        i++;
      } while ((numeroSeleccionado %i !=0)&&(i<=7));
    if ((numeroSeleccionado == 2) || (numeroSeleccionado ==3) || (numeroSeleccionado ==5) ||(numeroSeleccionado == 7)) {
        primo = true;
        }  
    if (primo) {
    System.out.println("El "+numeroSeleccionado +" es primo.");
    } else {
      System.out.println("El "+numeroSeleccionado +" no es primo.");
    }
  }
}

