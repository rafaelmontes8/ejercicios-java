import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[]args) {
  
    int horaDelDia;
    Scanner escanerEntrada = new Scanner(System.in);
  
    System.out.println("Introduce la hora del dia");
    horaDelDia = escanerEntrada.nextInt();
  
  
    if ((horaDelDia > 6)&&(horaDelDia < 12)) {
      
      System.out.println("Buenos días");
     
    } else {
      if ((horaDelDia > 13)&&(horaDelDia < 20)) {
        
        System.out.println("Buenas tardes");
        
      } else {
        
        if ((horaDelDia > 21) || (horaDelDia < 5)){
        
          System.out.println("Buenas noches");
        
        } else {
          
        
        }
      }
    }
  }
}
