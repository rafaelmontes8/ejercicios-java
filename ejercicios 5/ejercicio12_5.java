import java.util.Scanner;

public class ejercicio12_5 {
  public static void main(String[]args) {
  
    String letra;
    Scanner escanerEntrada = new Scanner(System.in);
    System.out.println("Introduce la cantidad de numeros de la sucesion de fibonacci que deseas:\n");
    int numero = escanerEntrada.nextInt();
    if (numero%2!=0) {
      numero /=2;
      int valor1 = 0;
      int valor2 = 1;
      System.out.print(valor1+ " ,");
      for (int i=1;i<=(numero);i++){ //recreamos la sucesion
        int respuesta= valor1 + valor2;
        valor1 = respuesta;
        System.out.print(valor1 + " ,");
        respuesta = valor1 + valor2;
        valor2 = respuesta;
        System.out.print(valor2 + " ,");
      }
    } else {  
        numero -=2;
        numero/=2;
        int valor1 = 0;
        int valor2 = 1;
        System.out.print(valor1+ " ,"+ valor2 + " ,");
        for (int i=1;i<=(numero);i++){ //recreamos la sucesion
          int respuesta= valor1 + valor2;
          valor1 = respuesta;
          System.out.print(valor1 + " ,");
          respuesta = valor1 + valor2;
          valor2 = respuesta;
          System.out.print(valor2 + " ,");
        }
    }
  }
}
//Creado por Rafael Montes Expósito
