package libreria;

public class SiguientePrimo {
  public static int nextprimo (int numero) { 
    boolean primo=true;
    int aux=numero+1;
    int solucion=0;
    do {
      for (int i=2;i<aux;i++) {
        if (aux % i==0) {
          primo=false;
          solucion=aux;
        }  
      }  
      aux++;
    } while (primo==false);
    System.out.print("El siguiente numero primo es: "+solucion);
    return numero;
  }
}
