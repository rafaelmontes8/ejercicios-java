package libreria;

public class Digitos {
  public static int digitos (int numero) { 
    int contador=0;
    do {
        numero /=10;
        contador++;
    } while (numero>0);
    System.out.print("El numero tiene "+contador+" digitos");
    return contador;
  }
}
