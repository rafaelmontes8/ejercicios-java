import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[]args) {

  double megaBytes;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce los Megaytes:");
  megaBytes = escanerEntrada.nextDouble();
  double kiloBytes;
  kiloBytes = megaBytes * 1024;
  System.out.printf("%.2f Megabytes equivalen a %.2f Kilobytes\n",megaBytes,kiloBytes);
  
  
  }
}
