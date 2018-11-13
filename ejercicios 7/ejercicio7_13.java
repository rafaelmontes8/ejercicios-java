import java.util.Scanner;
public class ejercicio7_13 {
  public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    int [] array = new int[100];
    int numero;
    int maximo=0;
    int minimo=500;
    for (int i=0;i<=99;i++) {
      numero=(int)(Math.random()*501);
      array[i] = numero;
      System.out.print(array[i] + " ");
    }
    System.out.println();
    int respuesta;
    System.out.print("¿Que desea destacar? (1.Mínimo;2.Máximo)");
    respuesta=s.nextInt();
    switch (respuesta) {
      case 1:
        for (int i=0;i<=99;i++) {
          if (minimo>array[i]) {
            minimo=array[i];
          }  
        } 
      break;
      case 2:
        for (int i=0;i<=99;i++) {
          if (maximo<array[i]) {
            maximo=array[i];
          }  
        }  
      break;
    } 
    for (int i=0;i<=99;i++) {
      if (array[i]==minimo||array[i]==maximo) {
        System.out.print(" **"+array[i]+"** ");
      } else {
        System.out.print(array[i]+" ");  
      }
    }  
  }
}

