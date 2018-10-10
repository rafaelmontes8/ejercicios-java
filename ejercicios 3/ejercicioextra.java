import java.util.Scanner;

public class ejercicioextra {
  public static void main(String[]args) {
  
  double precioConIva;
  double baseImponible;
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce el precio con IVA");
  precioConIva = escanerEntrada.nextDouble();
  
  
  double datoUtil = 1 + ( 1 / 0.21);
  double restarBaseImponible =  precioConIva / datoUtil;
  baseImponible = precioConIva - restarBaseImponible;
  
  
  System.out.printf("El predcio del producto sin IVA es %.2f\n",baseImponible);
  
  
  }
}
