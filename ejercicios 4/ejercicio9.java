import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[]args) {
  
  double a;
  double b;
  double c;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce el valor de a:");
  a = escanerEntrada.nextDouble();
  
  
  System.out.println("Introduce el valor de b:");
  b = escanerEntrada.nextDouble();
  
  System.out.println("Introduce el valor de b:");
  c = escanerEntrada.nextDouble();
  
  double operacion1 = (b * b) - 4 * a * c;
  
  if (operacion1 < 0) {
    System.out.println("No se puede resolver esta ecuación");
   } else {
  
  double operacion2 = Math.sqrt(operacion1);
  double x1;
  double x2;
  x1 = (-b + operacion2) / (2 * a);
  x2 = (-b - operacion2) / (2 * a);
      System.out.printf("Variable a: %.2f Variable b: %.2f Variable c: %.2f\n",a,b,c);
      System.out.printf("Valor de x1: %.2f Valor de x2: %.2f\n",x1,x2);
   }
  }
}
//Creado por Rafael Montes Expósito
