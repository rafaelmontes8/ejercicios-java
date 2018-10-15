import java.util.Scanner;

public class ejercicio9_5 {
  public static void main (String[] args) {
    int numero;
    int digitos = 1;
    Scanner escanerEntrada = new Scanner(System.in);
    System.out.print("Introduce un numero y te dire cuantos digitos tiene (entero): ");
    numero = escanerEntrada.nextInt();
     while (numero >= 10) {
    numero /= 10; 
    digitos++;
    } 
    System.out.println("El numero tiene " + digitos + " digitos");
  }
}

//Creado Por Rafael Montes Expósito
