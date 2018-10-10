import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[]args) {
  
  double precio;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  System.out.println("Indique el precio");
  precio = escanerEntrada.nextDouble();
  
  double iva;
  iva = precio * 0.21;

  
  double total;  
  total = precio + iva;
  
  System.out.printf("Precio:.....%.2f\n",precio);
  System.out.printf("IVA:....... %.2f\n",iva);
  System.out.println("____________________");
  System.out.printf("Total.......%.2f\n",total);
  
  }
}
