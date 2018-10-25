public class ejercicio6_2 {
  public static void main (String args[]) {
    System.out.println("Carta aleatoria de la baraja francesa:\n");
    int suma=0;  
    int carta=(int)(Math.random()*14+1);
    if (carta==11) {
      System.out.print("La carta es la J de "); 
    } else if (carta==12) {
      System.out.print("La carta es la Q de ");
    } else if (carta==13) {
      System.out.print("La carta es la K de ");
    } else if (carta==14) {
      System.out.print("La carta es la A de ");
    } else {
      System.out.print("La carta es el "+carta+ " de ");
    }   
    int palo =(int)(Math.random()*4+1);
    switch (palo) {
      case 1:
      System.out.print("corazones");
      break;
      case 2:
      System.out.print("picas");
      break;
      case 3:
      System.out.print("treboles");
      break;
      case 4:
      System.out.print("diamantes");
      break;
      default:
    }  
  }
}

