import java.util.Scanner;

public class ejercicio13 {
  public static void main(String[]args) {
  double numero1;
  double numero2;
  double numero3;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  System.out.println("Introduce el Primer Número (y los ordenare de mayor a menor):");
  numero1 = escanerEntrada.nextDouble();
  
  System.out.println("Introduce el segundo numero:");
  numero2 = escanerEntrada.nextDouble();
  
  System.out.println("Introduce el tercer numero:");
  numero3 = escanerEntrada.nextDouble();

  
    if ((numero1 < numero2) && (numero2 < numero3)) {
      System.out.printf("El orden seria: %.2f , %.2f y %.2f",numero3,numero2,numero1);
    
    } else if ((numero1 > numero3) && (numero3 > numero2) && (numero1 > numero2)) {
  
      System.out.printf("El orden seria: %.2f , %.2f y %.2f",numero1,numero3,numero2);
  
    } else if ((numero3 < numero2) && (numero3 > numero1)) {
      System.out.printf("El orden seria: %.2f , %.2f y %.2f",numero2,numero3,numero1);
    
    } else if ((numero1 > numero2) && (numero2 > numero3)) {
  
      System.out.printf("El orden seria: %.2f , %.2f y %.2f",numero1,numero2,numero3);
  
    } else if ((numero3 < numero2) && (numero3 > numero1)) {
      System.out.printf("El orden seria: %.2f , %.2f y %.2f",numero2,numero3,numero1);
    
    } else if ((numero1 > numero2) && (numero1 < numero3)) {
      System.out.printf("El orden seria: %.2f , %.2f y %.2f",numero3,numero1,numero2);
    }
  }
}
//Creado por Rafael Montes
