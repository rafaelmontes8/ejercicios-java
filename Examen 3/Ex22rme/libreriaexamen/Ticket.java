/*
 * @author Rafael Montes Expósito
 * Opción A
 * Esta funcion crea el ticket que saldra a pantalla con los datos
 */
package libreriaexamen;

public class Ticket {
  public static String ticket (double precio,double unidades,double totalSinIva,int codigo,double iva,double totalConIva) { 
    String ticket="";
    ticket +="A continuación, se le muestra el precio desglosado del pedido: \n";
    ticket +="----------------------------------------------\n";
    ticket +="Precio del artículo: "+precio+"\n";
    ticket +="Número de unidades: "+unidades+"\n";
    ticket +="Precio total unidades: "+totalSinIva+"\n";
    ticket +="Codigo de descuento aplicado: "+codigo+"  "+"\n";
    ticket +="IVA (21%): "+iva+"\n";
    ticket +="----------------------------------------------"+"\n";
    ticket +="PRECIO FINAL: "+totalConIva+"\n";
    System.out.println(ticket);
    return ticket;
  }
}
