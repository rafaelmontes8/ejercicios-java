import java.util.Scanner;

public class ejercicio19_5 {
  public static void main(String[]args) {
  
    String letra;
    Scanner escanerEntrada = new Scanner(System.in);
    System.out.println("Introduce la altura deseada para la piramide:\n");
    int altura = escanerEntrada.nextInt();
    System.out.println("Introduce el caracter que se va a utilizar para hacer la piramide:\n");
    letra = escanerEntrada.next();
    
    for (int i=1;i<=altura;i++){ //Con esto sacamos el numero de lineas a repetir
  
      for (int j=1; j<=altura-i; j++) {
      System.out.print(" ");  
      }
      for (int h=1; h<=(2*i-1); h++) {
      System.out.print(letra);
      }
      System.out.println();
    }
  }
}
//Creado por Rafael Montes Expósito
