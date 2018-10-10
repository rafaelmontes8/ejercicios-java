import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[]args) {

  double kiloBytes;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce los Kilobytes:");
  kiloBytes = escanerEntrada.nextDouble();
  double megaBytes;
  megaBytes = kiloBytes / 1024;
  System.out.printf("%.2f Kilobytes equivalen a %.2f Megabytes\n",kiloBytes,megaBytes);
  
  
  }
}
