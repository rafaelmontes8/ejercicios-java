public class ejercicio6_10 {
  public static void main (String args[]) {
    System.out.println("Texto aleatorio:\n");
    for (int i=0;i<=10;i++) {
      int caracteres=(int)(Math.random()*40+1);
      if (caracteres<=40) {
        for (int j=1;j<=caracteres;j++) {
            int numero=(int)(Math.random()*6+1);
            if (numero == 1) {
            System.out.print("*");
            } else if (numero == 2){
              System.out.print("-");
            } else if (numero == 3){
              System.out.print("=");
            } else if (numero == 4){
              System.out.print("|");
            } else if (numero == 5){
              System.out.print(".");
            } else if (numero == 6){      
              System.out.print("@"); 
            }  
        }  
        System.out.println();
      }
    }
  }
}

