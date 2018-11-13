import java.util.Scanner;
public class ejercicio7_15 {
  public static void main (String args[]) {
    Scanner s=new Scanner(System.in);
    int [] array = new int[10];
    int numero;
    int maximo=0;
    int minimo=500;
    boolean rellenado=false;
    for (int i=0;i<9;i++) {
    array[i]=(int)(Math.random()*5);
    }  
    int comensales;
    do {
      System.out.println();
      System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.println("│Mesa nº  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │ ");
      System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
      System.out.println("│Ocupación│ "+array[0]+"  │ "+array[1]+"  │ "+array[2]+"  │ "+array[3]+"  │ "+array[4]+"  │ "+array[5]+"  │ "+array[6]+"  │ "+array[7]+"  │ "+array[8]+"  │ "+array[9]+"  │ ");
      System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
      System.out.println("¿Cuantos comensales son? (para terminar 0)");
      comensales = s.nextInt();
      switch (comensales) {
        case 1:
          for (int i=0;i<=9;i++) {
            if (rellenado==false) {
              if (array[i]==0) {
                array[i]+=1;
                rellenado =true;
                System.out.println("Sientese en la mesa "+(i+1));
              }
            }  
          }
          for (int j=0;j<=9;j++) {
            if (rellenado==false) {
              if (array[j]<4) {
                array[j]+=1;
                rellenado =true;
                System.out.println("Sientese en la mesa "+(j+1));
              }
            }  
          }
          if (rellenado==false){
              System.out.println("Lo sentimos, no queda sitio, vuelta a intentarlo mas tarde");
            }
          rellenado = false;
          break;
        case 2:
          for (int i=0;i<=9;i++) {
            if (rellenado==false) {
              if (array[i]==0) {
                array[i]+=2;
                rellenado =true;
                System.out.println("Vayan a la mesa "+(i+1));
              }
            }  
          }
          for (int i=0;i<=9;i++) {
            if (rellenado==false) {
              if (array[i]-2<=0) {
                array[i]+=2;
                rellenado =true;
                System.out.println("Vayan a la mesa "+(i+1));
              }
            }  
          }
          if (rellenado==false){
              System.out.println("Lo sentimos, no queda sitio, vuelta a intentarlo mas tarde");
            }
          rellenado = false;
          break;
        case 3:
          for (int i=0;i<=9;i++) {
            if (rellenado==false) {
              if (array[i]==0) {
                array[i]+=3;
                rellenado =true;
                System.out.println("Vayan a la mesa "+(i+1));
              }
            }  
          }
          for (int i=0;i<=9;i++) {
            if (rellenado==false) {
              if (array[i]<=1) {
                array[i]+=3;
                rellenado =true;
                System.out.println("Vayan a la mesa "+(i+1));
              }
            }  
          }
          if (rellenado==false){
              System.out.println("Lo sentimos, no queda sitio, vuelta a intentarlo mas tarde");
            }
          rellenado = false;
          break;
        case 4:
          for (int i=0;i<=9;i++) {
            if (rellenado==false) {
              if (array[i]<=0) {
                array[i]+=4;
                rellenado =true;
                System.out.println("Vayan a la mesa "+(i+1));
              }
            }  
          }
          if (rellenado==false){
              System.out.println("Lo sentimos, no queda sitio, vuelta a intentarlo mas tarde");
            }
          rellenado = false;
          break;
        case 0:
          break;
        default: 
        System.out.println("Lo siento, no admitimos grupos de " +comensales+ " personas, vuelva a intentarlo");
      }
    } while (comensales>0);  
  }
}

