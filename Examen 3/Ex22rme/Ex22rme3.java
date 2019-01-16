/*
 * @author Rafael Montes Expósito
 * 16-01-2019
 *  Genera el precio (bien desglosado) de un pedido a un almacén en función de las siguientes condiciones:
 * - Se pregunta el precio del artículo, el número de unidades y el código de descuento. 
 * - El precio inicial del pedido se calcula multiplicando el precio unitario por la cantidad. 
 * - El código 685 hace que se resten 15 euros. 
 * - El código 778 aplica un 5% de descuento a las 20 primeras unidades. 
 * - El código 219 hace que las primeras 5 unidades salgan gratis (válido solo si se piden más de 5 unidades). 
 * - Al final se suma el 21% de IVA.
 */
import  libreriaexamen.Ticket;
import java.util.Scanner;
public class Ex22rme3 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el precio del articulo:");
    double precio=s.nextDouble();
    System.out.print("introduzca el numero de unidades:");
    double unidades=s.nextDouble();
    System.out.print("Introduzca el codigo de descuento:");
    int codigo=s.nextInt();
    double descuento;
    double aux;
    double totalSinIva=0;
    double totalConIva=0;
    double iva=0;
    double unidadesAux;
    if (codigo==685){
      aux=precio*unidades;
      totalSinIva=aux-15;
      iva=totalSinIva*0.21;
      totalConIva=iva+totalSinIva;
    } else if(codigo==778){
      if (unidades>20){
        unidadesAux=unidades-20;
        unidades-=20;
        aux=unidadesAux*precio;
        totalSinIva=unidades*precio;
        descuento=aux*0.05;
        aux-=descuento;
        totalSinIva+=aux;
        iva=totalSinIva*0.21;
        totalConIva=totalSinIva+iva;
      } else{
        aux=unidades*precio;
        descuento=aux*0.05;
        totalSinIva=descuento+aux;
        iva=totalSinIva*0.21;
        totalConIva=totalSinIva+iva;
      }
    } else if(codigo==219){
      if (unidades>5){
        unidades-=5;
      }
      aux=precio*unidades;
        iva=aux*0.21;
        totalConIva=aux+iva;
    } else{
      totalSinIva=unidades*precio;
      iva=totalSinIva*0.21;
      totalConIva=iva+totalSinIva;
    }
    Ticket.ticket(precio,unidades,totalSinIva,codigo,iva,totalConIva);
  }
}

