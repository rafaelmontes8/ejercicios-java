public class usoThis {
  
  public static void main (String[] args) {
    Caballo rocinante;
    Caballo clavilenio;
    
    rocinante = new Caballo("Rocinante","macho","Español");
    clavilenio = new Caballo("Clavileño","macho","Español");
    //String raza="Español";
    rocinante.setEdad(3);
    rocinante.setPeso(350);
    //rocinante.setRaza("Español");
    //rocinante.setRaza(raza);
    

    System.out.println(rocinante.getNombre());
  
    System.out.println(rocinante.getEdad());
    System.out.println();
    
    System.out.print(rocinante);
    System.out.println();
    System.out.print(clavilenio);
    
    System.out.println();
    
    
  }
}
