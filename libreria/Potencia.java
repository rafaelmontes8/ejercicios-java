package libreria;

public class Potencia {
  public static int potencia (int base,int exponente) { 
    int potencia=1;
    for (int i=0;i<exponente;i++) {
        potencia *=base;
    }  
    System.out.print(potencia);
    return potencia;
  }
}
