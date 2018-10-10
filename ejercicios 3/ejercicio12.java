import java.util.Scanner;

public class ejercicio12 {
  public static void main(String[]args) {
  
  double notaPrimer;
  double notaTrime;
  Scanner escanerEntrada = new Scanner(System.in);
  
  System.out.println("Introduce la nota del primer examen");
  notaPrimer = escanerEntrada.nextDouble();
  
  
  System.out.println("¿Que nota que quieres en el trimestre?");
  notaTrime = escanerEntrada.nextDouble();
  
  double datoNecesario1 = (notaPrimer * 0.4) - notaTrime;
  double notaNecesaria; 
  notaNecesaria = (datoNecesario1 / 0.6) * -1;
  
  
  System.out.printf("Para un %.2f  necesitas sacar un %.2f\n",notaTrime,notaNecesaria);
  
  
  }
}
