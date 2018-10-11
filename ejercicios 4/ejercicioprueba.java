import java.util.Scanner;

public class ejercicioprueba {
  public static void main(String[]args) {
  
    
    Scanner escanerEntrada = new Scanner(System.in);
  double radioCirculo;
  double pi = 3.14;  
    
    System.out.println("Introduce el radio del circulo");
    radioCirculo = escanerEntrada.nextDouble();
    
    double areaCirculo = pi * (radioCirculo * radioCirculo);
    
    
    System.out.println("El area es:" + areaCirculo);
  
  
    
          
    //Creado por Rafael Montes Expósito
        
      
    
  }
}
