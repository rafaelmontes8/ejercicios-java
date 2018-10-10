import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[]args) {
  
  double radio;
  double altura;
  double pi = 3.14;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce el radio del cono");
  radio = escanerEntrada.nextDouble();
  
  
  System.out.println("Introduce la altura del cono");
  altura = escanerEntrada.nextDouble();
  
  double resultadobasealtura;  
  resultadobasealtura =  pi * altura * (radio * radio);
  
  double solucion = resultadobasealtura / 3;
  
  System.out.printf("Base: %.2f Altura: %.2f \n",radio,altura);
  System.out.printf("Volumen del cono: %.2f\n",solucion);
  
  }
}
