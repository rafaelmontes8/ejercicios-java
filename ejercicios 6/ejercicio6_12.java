public class ejercicio6_12 {
  public static void main (String args[]) {
    System.out.println("Texto aleatorio:\n");
    int acumulador = 0;
    for (int j=1;j<=1000000;j++) {
        int numero=(int)(Math.random()*94+32);
        acumulador ++;
        char letra = (char)(numero);
        System.out.print(letra);
    }  
  }
}

