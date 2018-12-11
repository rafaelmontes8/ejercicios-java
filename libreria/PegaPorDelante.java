package libreria;

public class PegaPorDelante {
  public static int pegado (double numero,double pegar) { 
    double auxnumero=numero;
    int contador=0;
    double auxpegar=0.1;
    do {
        numero /=10;
        contador++;
    } while (numero>0);
    for (int i=0;i<=contador;i++) {
    auxpegar*=10;
    }  
    int pegado=(int)auxnumero+((int)auxpegar*(int)pegar);
    System.out.println("El numero con el "+pegar+" seria:" );
    System.out.print(pegado);
    return pegado;
  }
}
