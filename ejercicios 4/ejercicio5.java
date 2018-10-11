import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[]args) {
  
  double a;
  double b;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce el valor de a:");
  a = escanerEntrada.nextDouble();
  
  
  System.out.println("Introduce el valor de b:");
  b = escanerEntrada.nextDouble();
  
    if (a < 0) {
      System.out.println("Esa ecuación no tiene solución real");
    
    } else {
  
      double x;  
      x = -b / a;
  
  
      System.out.printf("Variable a: %.2f Variable b: %.2f \n",a,b);
      System.out.printf("Valor de x: %.2f\n",x);
    }
  }
}
//Creado por Rafael Montes Expósito
