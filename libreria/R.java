package libreria;

public class R {
  public static void buenosDias (String a) { 
    System.out.println("Buenos dias "+a);
  }  
  public static void probar (String a) { 
    System.out.println("Prueba: "+a+" la prueba");
  }  
  public static void Ocio (String a) { 
    System.out.println("Dame "+a+", cosa" );
  } 
  public static void mostrarArray (int[] pipo) {
    for (int i=0; i<6; i++) {
      System.out.print(pipo[i]);
      if (i<5) {
        System.out.print(", ");
      }
    }
  }
  public static int suma (int a,int b) {
    int suma= a+b;
    System.out.print(suma);
    return suma;
  }
}
