public class ejercicio6_13 {
  public static void main (String args[]) {
    System.out.println("Tiradas de dados hasta que salen iguales:\n");
    int tirada;
    int tirada2;
    int contador=0;
    do {
        tirada=(int)(Math.random()*6+1);
        tirada2 =(int)(Math.random()*6+1);
        contador++;
        System.out.println("Tirada "+contador + ":" + tirada+" " +tirada2);
    }  while (tirada != tirada2);
  }
}

