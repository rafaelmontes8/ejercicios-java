public class aleatorio { 
  public static void main(String[] args) {
    System.out.println("Diez números aleatorios:\n");
    for (int i = 1; i < 11; i++) { 
      System.out.println((int)(Math.random()*20+1) + " "); 
    }
  }
}
