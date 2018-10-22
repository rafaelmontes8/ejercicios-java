import java.util.Scanner;
public class ejercicio8_5{
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    System.out.println("introduce el numero del que quieres la tabla");
    int numeroSeleccionado = escanerEntrada.nextInt();
    int resultado;
    for(int i=0; i<=10;i++) {
      resultado =i*numeroSeleccionado;
      System.out.println(i +" * "+ numeroSeleccionado + "= " + resultado);
    }
  }
}

