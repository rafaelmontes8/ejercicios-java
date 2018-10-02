public class ejercicio5 {
  public static void main(String[]args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    
    System.out.printf("%-11s %-11s %-11s %-11s %-11s\n",  rojo +"LUNES",azul + "MARTES",naranja +"MIERCOLES",azul + "JUEVES",verde + "VIERNES");
    System.out.println("--------------------------------------------------------------");
    System.out.printf("%-11s %-11s %-11s %-11s %-11s\n",azul + "SINF",naranja + "PRO",verde + "EEDD",rojo + "EEDD",azul + "SINF");
    System.out.printf("%-11s %-11s %-11s %-11s %-11s\n",rojo + "SINF",verde + "PRO",naranja + "LM",azul + "PRO",rojo + "SINF");
    System.out.printf("%-11s %-11s %-11s %-11s %-11s\n",verde + "SINF",rojo + "PRO",azul + "LM",naranja + "PRO",azul + "SINF");
    System.out.printf("%-11s %-11s %-11s %-11s %-11s\n",naranja + "FOL",verde + "BBDD",rojo + "LM",azul + "PRO",naranja + "SINF");
    System.out.printf("%-11s %-11s %-11s %-11s %-11s\n",azul + "FOL",naranja + "BBDD",verde + "LM",rojo + "PRO",azul + "SINF");
    System.out.printf("%-11s %-11s %-11s %-11s %-11s\n",rojo + "FOL",verde + "BBDD",azul + "LM",naranja + "PRO",verde + "SINF");
  }
}
