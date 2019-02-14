/*
 * @author Rafael Montes Expósito
 *  Date: 12/02/2019
 * 
 */
package Ex20rme4A;

/**
 *
 * @author tux
 */
public class Revista implements Prestable{
    private int codigo;
    private String Titulo;
    private int anyo;
    private boolean prestado=false;

    public Revista(int codigo, String Titulo, int anyo) {
        this.codigo = codigo;
        this.Titulo = Titulo;
        this.anyo = anyo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getAnyo() {
        return anyo;
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
        return "Revista{" + "codigo=" + codigo + ", Titulo=" + Titulo + ", año=" + anyo + ", prestado=" + prestado + '}';
    }
    
}
