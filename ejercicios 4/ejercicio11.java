import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[]args) {
  
  int hora;
  int minutos;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  System.out.println("¿Que Hora es? (introduce solo la hora sin minutos y pulsa enter):");
  hora = escanerEntrada.nextInt();
  
  System.out.println("Introduce ahora los minutos:");
  minutos = escanerEntrada.nextInt();
  int segundosDia = 24 * 3600;
  int datoResolutivo = (hora * 3600) + (minutos * 60);
  
  int solucion = segundosDia - datoResolutivo;
  
    if (solucion < 0) {
      System.out.println("No se que has puesto en la hora, pero en algo te has equivocado");
    } else {
  
  System.out.printf("Faltan %d segundos hasta la media noche\n",solucion);
  
    }
  }
}
//Creado por Rafael Montes
