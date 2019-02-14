/*
 * @author Rafael Montes Expósito
 *  Date: 12/02/2019
 * 
 */
package Ex20rme3A;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex20rme3A {
    public static void main (String args []){
        Scanner s = new Scanner(System.in);
        int seleccion=0;
        int ordenacion=0;
        ArrayList<Persona> A = new ArrayList<>();
        while (seleccion!=4) {            
            System.out.println("Escoja una opción:");
            System.out.println("1.Llegada de una persona");
            System.out.println("2.Atender al primero de la cola");
            System.out.println("3.Mostrar cola");
            System.out.println("4.Salir del Programa");
            seleccion=Integer.parseInt(s.nextLine());
            switch (seleccion) {
                case 1:
                    System.out.println("Introduzca el nombre de la persona:");
                    String nombre=s.nextLine();
                    System.out.println("Introduzca el DNI:");
                    String dni=s.nextLine();
                    A.add(ordenacion,new Persona(nombre, dni));
                    ordenacion++;
                    break;
                case 2:
                    A.remove(0);
                    break;
                case 3:
                    for (Persona personaAux: A){
                        System.out.println(personaAux+"\n");
                    }
                    break;
                    
                case 4:
                break;
                default:
            }
        }
        
    }
}
