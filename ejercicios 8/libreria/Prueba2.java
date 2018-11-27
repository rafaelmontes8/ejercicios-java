package libreria;

public class Prueba2 {
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
}
