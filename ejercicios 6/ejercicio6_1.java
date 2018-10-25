public class ejercicio6_1 {
  public static void main (String args[]) {
    System.out.println("Diez números aleatorios:\n");
    int suma=0;  
    for (int i = 1; i < 4; i++) { 
      int dado=(int)(Math.random()*6+1);
      System.out.print("Los dados: " +dado + " "); 
      suma+=dado;
    }
  System.out.println("La suma de los dados es: " +suma);
  }
}

