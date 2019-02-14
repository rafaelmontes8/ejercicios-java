/*
 * @author Rafael Montes Expósito
 *  Date:
 * 
 */
package Ex20rme4A;

public class PruebaLibros {
    public static void main(String[] args) {
        Libro Quijote =new Libro(22, "Quijote", 1512);
        System.out.println(Quijote);
        Quijote.prestar();
        System.out.println(Quijote);
        Quijote.devolver();
        System.out.println(Quijote);
        Revista ComputerHoy=new Revista(13, "ComputerHoy", 2019);
        System.out.println(ComputerHoy);
        ComputerHoy.prestar();
        System.out.println(ComputerHoy);
        ComputerHoy.devolver();
        System.out.println(ComputerHoy);
    }
}
