public class ejercicio6 {
  public static void main (String[] args) {
    double precioBase =  20.00;
    double precioConIva = precioBase * 0.21 ;
    double total = precioBase + precioConIva;
    System.out.println("Base Imponible       " + precioBase);
    System.out.println("IVA                  " + precioConIva);
    System.out.println("------------------------");
    System.out.println("Total               " + total);
  }
}
