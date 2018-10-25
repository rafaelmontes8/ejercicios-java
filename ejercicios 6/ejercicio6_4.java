public class ejercicio6_4 { 
  public static void main(String[] args) {
    System.out.println("20 números aleatorios:\n");
    for (int i = 1; i <= 20; i++) { 
      System.out.print((int)(Math.random()*11) + " "); 
    }
  }
}
