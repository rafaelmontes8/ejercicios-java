import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[]args) {
  
  double horasSemanales;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  System.out.println("¿Cuantas horas ha trabajado esta semana?");
  horasSemanales = escanerEntrada.nextDouble();
  
  double salario;
  
  
  if (horasSemanales < 41) {
  salario = horasSemanales * 12;

  } else {
    
  salario =  horasSemanales * 16;
  }
  
  System.out.printf("Salario semanal: %.2f\n",salario);
  
  }
}
//Creado por Rafael Montes
