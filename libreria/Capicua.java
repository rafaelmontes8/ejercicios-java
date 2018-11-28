package libreria;

public class Capicua {
  public static int capicua (int numero) { 
    int aux =0;
    int N=0;
    int inverso=0;
    int cifra=0;
        //le damos la vuelta al número
    aux = numero;
    while (aux!=0){
      cifra = aux % 10;
      inverso = inverso * 10 + cifra;
      aux = aux / 10;
    }
 
    if(numero == inverso){
      System.out.println("Es capicua");
    }else{
      System.out.println("No es capicua");
    }
    return numero;
  }
}

