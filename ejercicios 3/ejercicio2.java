import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[]args) {
  
  double euros;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce los euros");
  euros = escanerEntrada.nextDouble();
  
  double pesetas = euros * 166.386;
  System.out.printf("Euros: %f Pesetas: %f\n",euros,pesetas);
  
  
  }
}
