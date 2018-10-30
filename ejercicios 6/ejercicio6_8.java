public class ejercicio6_7 {
  public static void main (String args[]) {
    System.out.println("Resultado de la quiniela:\n");
    for (int j=1;j<=15;j++) {
      for (int i = 1; i <= 3; i++) { 
        int numero=(int)(Math.random()*6+1);
        
        if ((numero == 1) || (numero == 2) || (numero == 3)) {
          System.out.print("      ");
          System.out.print("1");
        } else if (numero == 4){
          System.out.print("      ");
          System.out.print("2");
        } else if ((numero == 5) || (numero == 6)) {
          System.out.print("      ");
          System.out.print("X");
        }  
      }
    System.out.println();
    }  
  }
}

