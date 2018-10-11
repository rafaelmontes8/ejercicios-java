import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[]args) {
  
  double nota1;
  double nota2;
  double nota3;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce la primera nota:");
  nota1 = escanerEntrada.nextDouble();
  
  
  System.out.println("Introduce la segunda nota:");
  nota2 = escanerEntrada.nextDouble();
  
  System.out.println("Introduce la tercera nota:");
  nota3 = escanerEntrada.nextDouble();
    
  double mediaGlobal;  
  mediaGlobal = (nota1 + nota2 + nota3) /3;
  
  
      System.out.printf("Nota 1: %.2f Nota 2: %.2f Nota 3: %.2f \n",nota1,nota2,nota3);
      System.out.printf("Nota Media: %.2f\n",mediaGlobal);
  }
}
//Creado por Rafael Montes Expósito
