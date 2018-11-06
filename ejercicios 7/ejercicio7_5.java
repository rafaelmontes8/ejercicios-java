import java.util.Scanner;
public class ejercicio7_5 {
  public static void main (String args[]) {
    Scanner s= new Scanner(System.in);
    int[] numero = new int[10];
    int maximo=0;
    int minimo=9999999;
    for (int i=0;i<=9;i++) {
      System.out.println("Introduce el numero " +(i+1)+":");
      int numeroArray = s.nextInt();
      numero[i] =numeroArray;
      if(numeroArray<minimo) {
        minimo = numeroArray;
      } else if (maximo<numeroArray){
        maximo= numeroArray;
      } else {
      
      }    
    }
    System.out.println();
    for (int i=0;i<=9;i++) {
      if(numero[i]==maximo) {
      System.out.println("maximo " + numero[i]);
      } else if (numero[i]==minimo){
        System.out.println("minimo " + numero[i]);
      } else {
        System.out.println(numero[i]);
      }    
    }
  }
}

