import java.util.Scanner;
public class ejercicio14_4 {
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    double numero ;
    System.out.println("Introduce un numero y te dire si es par y//o divisible entre 5");
    numero = escanerEntrada.nextDouble();
    if ((numero % 2 == 0) && (numero % 5 == 0)) {
      System.out.println("El numero introducido es par y divisible entre 5");
    } else if (numero % 2 == 0){
      System.out.println("El numero introducido es par");  
    } else if (numero % 5 == 0){
      System.out.println("El numero introducido es divisible entre 5");
    }
  }
}
