import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[]args) {

  double pesetas;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce las pesetas");
  pesetas = escanerEntrada.nextDouble();
  double euros;
  euros = pesetas * 0.006;
  System.out.printf("Pesetas: %f Euros: %f\n",pesetas,euros);
  
  
  }
}
