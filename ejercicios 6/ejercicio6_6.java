import java.util.Scanner;
public class ejercicio6_6 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Intenta adivinar un numero entre 1 y 100:\n");
    int numeroSecreto = (int)(Math.random()*102); 
    for (int i = 1; i <= 5; i++) { 
      System.out.print("Intento "+i+":");
      int intento=s.nextInt();
      if (intento==numeroSecreto) {
        System.out.println("Ehnorabuena, lo has con seguido en " + i + " intentos");
      } else if(intento<numeroSecreto) {
        System.out.println("El numero es un poco mas grande, vuelve a intentarlo");
      } else if (intento>numeroSecreto){
        System.out.println("El numero es mas pequeño, vuelve a intentarlo");
      }     
    }
  }
}
