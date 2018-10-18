import java.util.Scanner;

public class ejercicio20_5 {
  public static void main(String[]args) {
  
    String letra;
    Scanner escanerEntrada = new Scanner(System.in);
    System.out.println("Introduce la altura deseada para la piramide:\n");
    int altura = escanerEntrada.nextInt();
    System.out.println("Introduce el caracter que se va a utilizar para hacer la piramide:\n");
    letra = escanerEntrada.next();
    int l=-1;
    for (int i=1;i<=altura;i++){ //Con esto sacamos el numero de lineas a repetir
  
      for (int j=0; j<=altura-i; j++) {
        System.out.print(" ");  
      
      }
      System.out.print(letra);
      for (int h=0; h<l; h++) {
          System.out.print(" ");
        }
      if ( i > 1) {
          System.out.print(letra); 
      }
      
      System.out.println();
      l += 2;
    }
    for (int ultimaLinea = 0; ultimaLinea <= (altura*2);ultimaLinea++) {
    System.out.print(letra);
    }
  }
}
//Creado por Rafael Montes Expósito
