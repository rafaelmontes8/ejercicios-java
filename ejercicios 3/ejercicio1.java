import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[]args) {
  
  int numero1;
  int numero2;
  int resultado;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce el primer número");
  numero1 = Integer.parseInt(escanerEntrada.nextLine());
  
  
  System.out.println("Introduce el segundo número");
  numero2 = Integer.parseInt(escanerEntrada.nextLine());
    
  resultado = numero1 * numero2;
  System.out.printf("%d * %d = %d\n",numero1,numero2,resultado);
  
  
  }
}
