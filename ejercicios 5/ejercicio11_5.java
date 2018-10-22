import java.util.Scanner;
public class ejercicio11_5{
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    System.out.println("introduce un numero y te dire el cuadrado y el cubo de sus 5 siguientes numeros enteros");
    int numeroSeleccionado = escanerEntrada.nextInt();
    int cuadrado;
    int cubo;
    for(int i=numeroSeleccionado; i<=(numeroSeleccionado+5);i++) {
      cuadrado=i * i;
      cubo =i * i * i;
      System.out.println(i +" cuadrado: "+ cuadrado + " cubo: " + cubo);
    
    }
  }
}

