package libreria;

public class EsPrimo {
  public static int primo (int numero) { 
    boolean primo=true;
    
    for (int i=2;i<numero;i++) {
      if (numero % i==0) {
        primo=false;
      }  
    }  
    if (primo==true) {
    System.out.print("El numero "+numero+" es primo");
    } else {
      System.out.print("El numero "+numero+" no es primo");
    }
    return numero;
  }
}
