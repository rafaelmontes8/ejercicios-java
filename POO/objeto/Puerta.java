public class Puerta {
   //atributos
   private String nombre;
   private String color;
   private String tamanio;
   private double altura;
   
   //metodos
   Puerta (String name,String color, String tamanio,double altura) {
      this.nombre=name;
      this.color = color;
      this.tamanio = tamanio;
      this.altura = altura;
    }
    String getColor() {
        return this.color;
      }
    String getTamanio (){
      return this.tamanio;
    }
    double getAltura(){
      return this.altura;
    }
    void setAltura (double altura){
      this.altura = altura;
    }
    void setTamanio (String size){
      this.tamanio = size;
    }
    void setColor (String color){
      this.color=color;
    }
    public String toString(){
      String ficha="";
      ficha= "Puerta: "+this.nombre+"\n";
      ficha +="Color: "+this.color+"\n";
      if (this.altura >=0){
        ficha += "Altura: "+this.altura+"\n";
      }
      ficha += "Tamaño: "+this.tamanio+"\n";      
      return ficha;
    }
}
