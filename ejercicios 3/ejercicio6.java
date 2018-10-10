import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[]args) {
  
  double base;
  double altura;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce la base");
  base = escanerEntrada.nextDouble();
  
  
  System.out.println("Introduce la altura");
  altura = escanerEntrada.nextDouble();
  
  double resultadobasealtura;  
  resultadobasealtura = base * altura;
  
  double solucion = resultadobasealtura / 2;
  
  System.out.printf("Base: %.2f Altura: %.2f \n",base,altura);
  System.out.printf("Area del triangulo: %.2f\n",solucion);
  
  
  }
}
