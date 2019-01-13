/*
 * @author Rafael Montes Exposito
 * 
 * El programa introduce permite introducir numeros del 1 al 100 mostrando cuantas veces se ha introducido cada numero.
*/
import java.util.Scanner;
public class EjercicioNota {
  public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    int contador=0;
    int [] arrayaux=new int[101];
    System.out.println("Introduce numeros hasta de 1 al 100 y te mostrare cuantas veces has introducido cada numero(para parar introduce -1)");
    int introduccion=0;
    int i=0;
      introduccion=s.nextInt();
      do {
        introduccion=s.nextInt();
        if (introduccion>1 && introduccion<100) {
          introduccion=s.nextInt();
        while(introduccion!=-1){
            introduccion=s.nextInt();
            if (introduccion>1 && introduccion<100) {
            arrayaux[introduccion]++;
            contador++;
            }
          }
        }
      } while(introduccion!=-1);  
    for (int j=0;j<=arrayaux.length-1;j++){
      if (arrayaux[j]!=0){
      System.out.print(j+":");
      System.out.print(arrayaux[j]+", ");
      }else {
      }
    }
  }
}