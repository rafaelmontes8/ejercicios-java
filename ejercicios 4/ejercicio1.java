import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[]args) {
  
    String diaDeLaSemana;
    Scanner escanerEntrada = new Scanner(System.in);
  
    System.out.println("Introduce el dia de la semana");
    diaDeLaSemana = escanerEntrada.next();
  
  
    if (diaDeLaSemana.equals("lunes")) {
      System.out.println("A primera hay Sistemas Informáticos y Redes");
     
    } else {
      if (diaDeLaSemana.equals("martes")) {
        
        System.out.println("A primera hay programación");
        
      } else {
        
        if (diaDeLaSemana.equals("miercoles")){
        
          System.out.println("A primera hay Entornos de Desarrollo");
        
        } else {
        
          if (diaDeLaSemana.equals("jueves")) {
            
            System.out.println("A primera hay Entornos de Desarrollo");
        
          } else {
        
            if (diaDeLaSemana.equals("viernes")) {
            
            System.out.println("A primera hay Sistemas Informaticos y Redes");
        
            } else {
        
              System.out.println("Respuesta no valida, pruebe otra");
            }
          }
        }    
      }
    }
  }
}
