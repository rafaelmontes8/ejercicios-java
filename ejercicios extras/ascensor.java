/** 
 * Se tiene un ascensor para 6 personas, se tiene que introducir el peso de los 6 mostrandolos despues, jjunto con el peso total. Si el peso supera el limite de carga del ascensor este no subira.
 *  
 *  @author Rafael Montes Expósito
 */
import java.util.Scanner;
public class ascensor {
  public static void main( String[] args ) {
    Scanner s= new Scanner(System.in);
    int [] ascensor= new int [6];
    int pesoTotal=0;
    boolean subir = false;
    do {
    System.out.println("Introduzca los pesos de las personas que pueden subir en el ascensor (Maximo 6 personas):");
    
    for (int i=0;i<=5;i++) {
      ascensor [i]=s.nextInt();
    }
    for (int a:ascensor) {
      pesoTotal+=a;
    }
    for (int b:ascensor) {
      System.out.print(b+" ,");
    }
    System.out.println("El peso total es: "+pesoTotal);
    if (pesoTotal > 450) {
      System.out.println("El peso es superior al limite que es 450Kg, por lo que no subira, pruebe de nuevo");
    } else {
      subir=true;
      System.out.print("El ascensor puede subir");
    }
    } while (false==subir);
  }
}

