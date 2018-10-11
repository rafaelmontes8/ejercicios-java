import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[]args) {
  
    int diaDeLaSemana;
    Scanner escanerEntrada = new Scanner(System.in);
  
    System.out.println("Introduce el dia de la semana");
    diaDeLaSemana = escanerEntrada.nextInt();
  
  
    if (diaDeLaSemana == 1) {
      
      System.out.println("Lunes");
     
    } else {
      if (diaDeLaSemana == 2) {
        
        System.out.println("Martes");
        
      } else {
        
        if (diaDeLaSemana == 3){
        
          System.out.println("Miercoles");
        
        } else {
        
          if (diaDeLaSemana == 4) {
            
            System.out.println("Jueves");
        
          } else {
        
            if (diaDeLaSemana == 5) {
            
              System.out.println("Viernes");
        
            } else {
              
              if (diaDeLaSemana == 6) {
              
                System.out.println("Sabado");
              
              } else {
                
                if (diaDeLaSemana == 7) {
                  
                  System.out.println("Domingo");
                  
                } else {
                  
                  System.out.println("Respuesta no valida, pruebe otra");
            
              
                }
              }
            }
          }
        }    
      }
    }
  }
}
