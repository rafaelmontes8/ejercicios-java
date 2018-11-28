package libreria;

public class Voltea {
  public static int volteado (int numero) { 
    int contenedor=numero;
    int inverso =0;
    int cifra = 0;
      while(numero!=0){
        cifra = numero%10;
        inverso = (inverso * 10) + cifra;
        numero/=10;
      }
    System.out.print("El numero "+contenedor+" al reves es "+inverso);
    return inverso;
  }
}
