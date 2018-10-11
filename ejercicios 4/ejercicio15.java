import java.util.Scanner;

public class ejercicio15 {
  public static void main(String[]args) {
  
  String letra;
  int piramide;
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce el caracter que se va a utilizar para hacer la piramide:\n");
  letra = escanerEntrada.nextLine();
  System.out.println("1.arriba\n");
  System.out.println("2.abajo\n");
  System.out.println("3.izquiera\n");
  System.out.println("4.derecha\n");
  
  piramide = escanerEntrada.nextInt();
    switch (piramide){
  
    case 1:
    System.out.printf("%7s\n",letra);
    System.out.printf("%6s %s\n",letra,letra);
    System.out.printf("%5s %s %s\n",letra,letra,letra);
    System.out.printf("%4s %s %s %s\n",letra,letra,letra,letra);
    System.out.printf("%3s %s %s %s %s\n",letra,letra,letra,letra,letra);
    System.out.printf("%2s %s %s %s %s %s\n",letra,letra,letra,letra,letra,letra);
    System.out.printf("%s %s %s %s %s %s %s\n",letra,letra,letra,letra,letra,letra,letra);
    break;
    case 2:
    System.out.printf("%s %s %s %s %s %s %s\n",letra,letra,letra,letra,letra,letra,letra);
    System.out.printf("%2s %s %s %s %s %s\n",letra,letra,letra,letra,letra,letra);
    System.out.printf("%3s %s %s %s %s\n",letra,letra,letra,letra,letra);
    System.out.printf("%4s %s %s %s\n",letra,letra,letra,letra);
    System.out.printf("%5s %s %s\n",letra,letra,letra);
    System.out.printf("%6s %s\n",letra,letra);
    System.out.printf("%7s\n",letra);
    break;
    case 3:
    System.out.printf("    %s\n",letra);
    System.out.printf("  %s %s\n",letra,letra);
    System.out.printf("%s %s %s\n",letra,letra,letra);
    System.out.printf("  %s %s\n",letra,letra);
    System.out.printf("    %s\n",letra);
    break;
    case 4:
    System.out.printf("%s\n",letra);
    System.out.printf("%s %s\n",letra,letra);
    System.out.printf("%s %s %s\n",letra,letra,letra);
    System.out.printf("%s %s\n",letra,letra);
    System.out.printf("%s\n",letra);
    break;
    }
  }
}
//Creado por Rafael Montes Expósito
