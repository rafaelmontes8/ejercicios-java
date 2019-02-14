/*
 * @author Rafael Montes Expósito
 *  Date:
 * 
 */
package Ex20rme4A;
public class Libro implements Prestable{
    private int codigo;
    private String Titulo;
    private int anyo;
    private boolean prestado=false;

    public Libro(int codigo, String Titulo, int anyo) {
        this.codigo = codigo;
        this.Titulo = Titulo;
        this.anyo = anyo;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    @Override
    public void prestar(){
        this.prestado=true;
    } 
    @Override
    public void devolver() {
        this.prestado=false;
    }
    @Override
    public boolean prestado(){
            return prestado;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", Titulo=" + Titulo + ", año=" + anyo + ", prestado=" + prestado + '}';
    }
}

