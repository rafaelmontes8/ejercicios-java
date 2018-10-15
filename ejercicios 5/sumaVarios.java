import java.util.Scanner;


public class sumaVarios {
  public static void main (String args[]) {
    int acumulador = 0;
    int sumando;
  
    System.out.println("Introduzca el numero de numeros que quiere sumar:");
    Scanner escanerEntrada = new Scanner(System.in);
    int numSumandos = escanerEntrada.nextInt();
  
    for (int i=0; i<numSumandos; i++) {
      System.out.print("Introduzca el sumando nº " + i + ": ");
      sumando = escanerEntrada.nextInt();
      acumulador +=sumando;
    } 
    System.out.print("La suma de los " + numSumandos + " números introducidos es: " + acumulador);
  }
}

