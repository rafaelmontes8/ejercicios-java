public class ejercicio6_3 {
  public static void main (String args[]) {
    System.out.println("Carta aleatoria de la baraja francesa:\n");
    int suma=0;  
    int carta=(int)(Math.random()*10+1);
    if (carta==8) {
      System.out.print("La carta es la Sota de "); 
    } else if (carta==9) {
      System.out.print("La carta es el Caballo de ");
    } else if (carta==10) {
      System.out.print("La carta es el Rey de ");
    } else if (carta==1) {
      System.out.print("La carta es el As de ");
    } else {
      System.out.print("La carta es el "+carta+ " de ");
    }   
    int palo =(int)(Math.random()*4+1);
    switch (palo) {
      case 1:
      System.out.print("oros");
      break;
      case 2:
      System.out.print("bastos");
      break;
      case 3:
      System.out.print("copas");
      break;
      case 4:
      System.out.print("espadas");
      break;
      default:
    }  
  }
}

