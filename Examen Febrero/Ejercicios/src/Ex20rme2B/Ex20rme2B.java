/*
 * @author Rafael Montes Expósito
 *  Date: 12/02/2019
 * 
 */
package Ex20rme2B;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class Ex20rme2B {
    public static void main(String[] args) {
        HashMap<String, String> D = new HashMap<>();
        int seleccion=0;
        Scanner s= new Scanner(System.in);
        while (seleccion!=4) {            
            System.out.println("Elija una opción:");
            System.out.println("1.Buscar frase mediante palabra");
            System.out.println("2.Borrar una palabra y su frase asociada");
            System.out.println("3.Mostrar diccionario");
            System.out.println("4.Salir del Programa");
            seleccion=Integer.parseInt(s.nextLine());
            switch (seleccion) {
                case 1:
                    System.out.println("Introduzca la palabra y le mostrare la frase(en caso de no estar la palabra, debera crear el resgistro en el diccionario):");
                    String palabra=s.nextLine();
                    System.out.println("La plabra y su frase:\n"+D.get(palabra));
                    String frase;
                    if (D.get(palabra)==null) {
                        System.out.println("La palabra no estaba en el diccionario introduzca una frase para asociarla a la palabra:");
                        frase=s.nextLine();
                        D.put(palabra, frase);
                    }
                    break;
                case 2:
                    System.out.println("Introduzca la palabra que desea borrar junto con su frase:");
                    String palabraARemover=s.nextLine();
                    D.remove(palabraARemover);
                    break;
                case 3:
                    for (Map.Entry palabras: D.entrySet()) { 
                        System.out.println(palabras+"\n"); 
                    }
                    break;
                    
                case 4:
                break;
                default:
            }
        }
    }
}
