/*
 * @author Rafael Montes Expósito
 *  Date:
 * 
 */
package Ex20rme3A;


public class Persona {
    private String DNI;
    private String Nombre;

    public Persona(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", Nombre=" + Nombre + '}';
    }
    
}
