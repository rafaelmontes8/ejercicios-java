import java.util.Scanner;
public class ejercicio77_1 {
  public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    int [][] array = new int[3][6];
    array[0][0]=0;
    array[0][1]=30;
    array[0][2]=2;
    array[1][0]=75;
    array[2][2]=-2;
    array[2][3]=9;
    array[1][4]=0;
    array[0][5]=5;
    array[2][5]=11;
    for (int i=0;i<=2;i++) {
      System.out.print("Fila "+i+":  ");
      for (int j=0;j<=5;j++) {
        System.out.print(array[i][j]+"  ");
      }  
      System.out.println();
    }
  }
}

