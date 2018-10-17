import java.util.Scanner;
public class ejercicio35_5 {
  
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    int altura;
    System.out.print("Dime la altura de la \"X\" :");
    altura = escanerEntrada.nextInt();
    
    if(((altura%2) !=0) && (altura >= 3)) {
      //pintar la primera parte de la x
      int espaciosIntermedios = altura - 2;
      for (int i=1;i<=(altura/2+1);++i) {
        for (int j=1;j<i;++j) {
          System.out.print(" ");
        }
        if (i < (altura/2)+1) {
          System.out.print("*");
        }   
        for (int j=1;j<=espaciosIntermedios;j++) {
          System.out.print(" ");
        }
        System.out.print("*\n");
        espaciosIntermedios -=2;
      }
      espaciosIntermedios =1;
      for (int i=altura/2; i>=1; --i) {
        for (int j=1; j<i; ++j) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int j=1;j<=espaciosIntermedios;j++) {
          System.out.print(" ");
        }
        System.out.print("*\n");
        espaciosIntermedios +=2;
      }
    } else {
    System.out.print("El numero introducido es par y no puedo pintar la X, lo siento");
    }  
  }
}
