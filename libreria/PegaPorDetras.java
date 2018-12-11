package libreria;

public class Digitos {
  public static int digitos (int numero,int pegar) { 
    int auxnumero=numero;
    int contador=0;
    int auxpegar=1;
    do {
        numero /=10;
        contador++;
    } while (numero>0);
    for (int i=0;i<=contador;i++) {
    auxpegar*=10;
    }  
    int pegado=auxnumero+(auxpegar*pegar);
    System.out.println("El numero con el "+pegar+" seria:" );
    System.out.print(pegado);
    return pegar;
  }
}
