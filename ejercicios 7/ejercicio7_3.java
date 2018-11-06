import java.util.Scanner;
public class ejercicio7_3 {
  public static void main (String args[]) {
    Scanner s= new Scanner(System.in);
    int[] numero = new int[10];
    for (int i=0;i<=9;i++) {
      System.out.println("Introduce el numero " +(i+1)+":");
      int numeroArray = s.nextInt();
      numero[i] =numeroArray;
    }
    System.out.println();
    for (int i=9;i>=0;i--) {
      System.out.println(numero[i]);
    }    
  }
}

