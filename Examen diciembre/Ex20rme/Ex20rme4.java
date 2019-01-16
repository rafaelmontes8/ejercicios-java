/*  Fecha: 12-12-2018
 *  @author Rafael Montes Expósito
 *  
 *   Escriba un programa que solicite al usuario números enteros comprendidos entre los valores 1 y 100,
 *   y que genere un histograma con las frecuencias de cada número entero introducido. Si el valor introducido
 *   está fuera del rango [1,100], se informará al usuario que el valor no es válido y será ignorado, volviéndosele a
 *   solicitar un nuevo valor, salvo en el caso del valor -1, que servirá para finalizar la captura de enteros. Para
 *   representar las barras del histograma utilice secuencias del carácter ‘*’. 
*/
import java.util.Scanner;
public class Ex20rme4{
  public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    int numero=s.nextInt();
    int [] array=new int [contador];
    int contador=0;
    if (numero>100||numero<1) {
      System.out.println("El numero se sale del rango, vuelve a introducir otro");
      numero=s.nextInt();
    }
    while (numero!=-1) {
      int i=0;
      numero =array [i];
      numero=s.nextInt();
      if (numero>100||numero<1) {
        System.out.println("El numero se sale del rango, vuelve a introducir otro");
        numero=s.nextInt();
      }
      numero=s.nextInt();
      i++;
      contador++;
    }
    for (int a: array) {
    System.out.println(a+", ");
    }
  }
}


