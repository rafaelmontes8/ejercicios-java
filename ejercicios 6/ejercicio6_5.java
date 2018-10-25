public class ejercicio6_5 { 
  public static void main(String[] args) {
    System.out.println("20 números aleatorios:\n");
    int maximo = 0;
    int minimo = 199;
    int acumulador=0;
    for (int i = 1; i <= 50; i++) {
      int numero = (int)(Math.random()*100+100);
      acumulador +=numero;
      System.out.print(numero + " ");
      if (numero>=maximo) {
        maximo=numero;
      }  
      if (numero<=minimo) {
        minimo=numero;
      }
      System.out.print(numero + " ");
    }
    System.out.print("\n");
    int media = acumulador/50;
    System.out.println("El maximo numero es: " +maximo);
    System.out.println("El minimo numero es: " +minimo);
    System.out.println("La media de los numero es: "+ media);
  }
}
