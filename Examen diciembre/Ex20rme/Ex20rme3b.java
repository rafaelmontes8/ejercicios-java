/*  Fecha: 12-12-2018
 *  @author Rafael Montes Expósito
 *  
 *  Hacer un programa para visualizar los números curiosos que hay entre el número 2 y un número
 *  introducido desde teclado. Un número es curioso si su cuadrado tiene al propio número como últimas cifras.
 *  Así, el número 25 es curioso ya que su cuadrado es 625, también es curioso 76 porque su cuadrado es 5776
*/
import java.util.Scanner;
import paqueteExamen.NumeroSinUnidad;
import paqueteExamen.UltimoDigito;
import paqueteExamen.NumeroCurioso;
public class Ex20rme3b{
  public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce un numero y te dire si es Curioso:");
    long numero= s.nextLong();
    long cuadrado= numero*numero;
    if (true == NumeroCurioso.Curioso(numero,cuadrado)) {
      System.out.print("El numero es curioso");
    } else {
      System.out.print("El numero no es curioso");
    }
  }
}


