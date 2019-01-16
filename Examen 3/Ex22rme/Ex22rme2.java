/*
 * @author Rafael Montes Expósito
 * 16-01-2019
 * Opción A
 * Escribe un programa que, a partir de 2 enteros introducidos por el usuario, 
 * diga cuántos dígitos del primer número están en el segundo número. 
 * Se recomienda usar long en lugar de int ya que el primero admite números más largos
 * 
 */
import libreriaexamen.Digitos;
import java.util.Scanner;
public class Ex22rme2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    long numeroPrincipal=0;
    long numeroSecundario=0;
    System.out.print("Introduce el numero que luego voy a comprobar si esta contenido en otro:");
    numeroPrincipal=s.nextInt();
    System.out.print("Introduce el numero que se va a comprobar si esta en el anterior:");
    numeroSecundario=s.nextInt();
    long cifraSuelta=0;
    long cifraSueltaAux=0;
    long contador=0;
    long numeroAux;
    long numeroPrincipalAux=numeroPrincipal;
    long numeroSecundarioAux;
    for(int i=0;i<Digitos.digitos(numeroPrincipal);i++){
      cifraSuelta=numeroPrincipalAux % 10;
      numeroPrincipalAux/=10;
      numeroSecundarioAux=numeroSecundario;
      for(int j=0;j<Digitos.digitos(numeroSecundario);j++){
        cifraSueltaAux=numeroSecundarioAux % 10;
        numeroSecundarioAux/=10;
        if(cifraSuelta==cifraSueltaAux){
          contador++;
        }
      }
    }
    System.out.print("El numero "+numeroSecundario+" contiene: "+contador+" digitos del numero "+numeroPrincipal);
  }
}
