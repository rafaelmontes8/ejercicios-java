public class ejercicio6_7 {
  public static void main (String args[]) {
    System.out.println("Resultado de la quiniela:\n");
    for (int j=1;j<=15;j++) {
      for (int i = 1; i <= 3; i++) { 
        int numero=(int)(Math.random()*3+1);
        if (numero ==1) {
          System.out.print("      ");
          System.out.print("1");
        } else if (numero == 2){
          System.out.print("      ");
          System.out.print("2");
        } else if (numero == 3) {
          System.out.print("      ");
          System.out.print("X");
        }  
      }
    System.out.println();
    }  
  }
}

