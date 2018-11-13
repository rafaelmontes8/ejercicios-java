import java.util.Scanner;
public class ejercicio7_6 {
  public static void main (String args[]) {
    Scanner s= new Scanner(System.in);
    int[] numero = new int[15];
    for (int i=0;i<=9;i++) {
      System.out.println("Introduce el numero " +(i+1)+":");
      int numeroArray = s.nextInt();
      if (i<9) {
        numero[(i+1)] =numeroArray;
      } else {
        numero[0] =numeroArray;
      }  
    }
    System.out.println();
    for (int i=0;i<=9;i++) {
      System.out.println(numero[i]);
    }
  }
}

