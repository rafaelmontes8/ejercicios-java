import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[]args) {
  
  double horasDiarias;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  System.out.println("¿Cuantas horas ha trabajado hoy?");
  horasDiarias = escanerEntrada.nextDouble();
  
  double horasSemanales;
  horasSemanales = horasDiarias * 7;

  
  double salarioEstimado;  
  salarioEstimado =  12 * horasSemanales;
  
  System.out.printf("Salario semanal suponiendo que trabaja 6 días %.2f\n",salarioEstimado);
  
  }
}
//Creado por Rafael Montes
