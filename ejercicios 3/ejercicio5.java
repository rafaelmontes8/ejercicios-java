import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[]args) {
  
  double base;
  double altura;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce la base del rectangulo");
  base = escanerEntrada.nextDouble();
  
  
  System.out.println("Introduce la altura del rectangulo");
  altura = escanerEntrada.nextDouble();
  
  double resultadobasealtura; 
  resultadobasealtura = base * altura;
  
  
  System.out.printf("Base: %.2f Altura: %.2f\n",base,altura);
  System.out.printf("Area: %.2f\n",resultadobasealtura);
  
  
  }
}
