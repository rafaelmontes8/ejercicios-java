import java.util.Scanner;

public class ejercicio15_5 {
 public static void main (String[] args) {
   int base;
   int exponente;
   int solucion=1;
   Scanner escanerEntrada = new Scanner(System.in);
   System.out.print("Introduce la base (entero): ");
   base = escanerEntrada.nextInt();
   System.out.print("Introduce el numero de potencias que quieres (entero): ");
   exponente = escanerEntrada.nextInt();

   for (int i=1; i<=exponente; i++) {
     solucion *= base;
   System.out.println(" "+ solucion);
   }
 }
}

//Creado Por Rafael Montes Expósito
