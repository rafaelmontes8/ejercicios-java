import java.util.Scanner;
public class ejercicio77_2 {
  public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    int [][] array = new int[4][5];
    int numero;
    int sumaFila1=0;
    int sumaFila2=0;
    int sumaFila3=0;
    int sumaFila4=0;
    int sumaColumna1=0;
    int sumaColumna2=0;
    int sumaColumna3=0;
    int sumaColumna4=0;
    int sumaColumna5=0;
    for (int i=0;i<4;i++) { 
      for (int j=0;j<5;j++) { 
        System.out.println("Introduzca la fila "+(i+1)+" columna "+(j+1)+"");
        numero = s.nextInt();
        if (i==0) {
          sumaFila1 +=numero;
        } else if (i==1){
          sumaFila2 +=numero;
        } else if (i==2) {
          sumaFila3 +=numero;
        } else if (i==3){
          sumaFila4 +=numero;
        }  
        if (j==0) {
          sumaColumna1 +=numero;
        } else if (j==1){
          sumaColumna2 +=numero;
        } else if (j==2) {
          sumaColumna3 +=numero;
        } else if (j==3){
          sumaColumna4 +=numero;
        }  else if (j==4) {
          sumaColumna5 +=numero;
        }  
        array[i][j]=numero;
      }  
    }
     int sumaTotal= sumaFila1 + sumaFila2 + sumaFila3 + sumaFila4;
      System.out.println();
      System.out.printf("   %d    %d    %d    %d     %d suma:  %d \n",array[0][0],array[0][1],array[0][2],array[0][3],array[0][4],sumaFila1);
      System.out.printf("   %d    %d    %d    %d     %d suma:  %d \n",array[1][0],array[1][1],array[1][2],array[1][3],array[1][4],sumaFila2);
      System.out.printf("   %d    %d    %d    %d     %d suma:  %d \n",array[2][0],array[2][1],array[2][2],array[2][3],array[2][4],sumaFila3);
      System.out.printf("   %d    %d    %d    %d     %d suma:  %d \n",array[3][0],array[3][1],array[3][2],array[3][3],array[3][4],sumaFila4);
      System.out.printf("suma: %d suma: %d suma: %d suma: %d suma: %d SumaTotal: %d",sumaColumna1,sumaColumna2,sumaColumna3,sumaColumna4,sumaColumna5,sumaTotal);
  }
}

