import java.util.Scanner;

public class ejercicio21_5{
  public static void main (String args[]) {
    int numeroElementos = 0;
    int numeroIntroducido;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar = 0;
    Scanner escanerEntrada = new Scanner(System.in);
    do {
      System.out.print("Introduzca una seria de numeros enteros (negativo para parar):");
      numeroIntroducido = escanerEntrada.nextInt();
      if (numeroIntroducido >=0) {
        numeroElementos++;
        if ((numeroIntroducido%2) !=0) {
          sumaImpares += numeroIntroducido;
          numeroDeElementosImpares++;
        } else {
          if(numeroIntroducido > maximoPar) {
            maximoPar = numeroIntroducido;
          } 
        }
      }
    } while (numeroIntroducido >= 0);
    
    System.out.print("La media de los numeros impares es: " + sumaImpares/numeroDeElementosImpares + "\n");
    System.out.print("Ha introducido " + numeroElementos + "numeros\n");
    System.out.print("El maximo par es " + maximoPar + "\n");
  }
}

