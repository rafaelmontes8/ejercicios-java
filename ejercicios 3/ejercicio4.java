import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[]args) {
  
  int numero1;
  int numero2;
  int resultadosuma;
  int resultadoresta;
  int resultadomulti;
  int resultadodivi;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce el primer número");
  numero1 = Integer.parseInt(escanerEntrada.nextLine());
  
  
  System.out.println("Introduce el segundo número");
  numero2 = Integer.parseInt(escanerEntrada.nextLine());
    
  resultadosuma = numero1 + numero2;
  resultadoresta = numero1 - numero2;
  resultadomulti = numero1 * numero2;
  resultadodivi = numero1 / numero2;
  
  System.out.printf("%d + %d = %d\n",numero1,numero2,resultadosuma);
  System.out.printf("%d - %d = %d\n",numero1,numero2,resultadoresta);
  System.out.printf("%d * %d = %d\n",numero1,numero2,resultadomulti);
  System.out.printf("%d / %d = %d\n",numero1,numero2,resultadodivi);
  
  
  }
}
