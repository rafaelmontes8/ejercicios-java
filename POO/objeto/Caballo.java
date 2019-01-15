public class Caballo {
   //atributos
   private String raza;
   private int peso;
   private String nombre;
   private boolean sexo; //false macho true hembra
   private int edad;
   
   //metodos
   Caballo (String name, String sex,String raza) {
    this.nombre = name;
      if (sex.equals("macho")){
        this.sexo=false;
      }else{
        this.sexo = true;
      }
      this.edad = -1;
      this.peso = -1;
      this.raza = raza;
    }
    String getNombre() {
        return this.nombre;
      }
    int getEdad (){
      return this.edad;
    }
    int getPeso(){
      return this.peso;
    }
    void setEdad (int time){
      this.edad = time;
    }
    void setPeso (int heavy){
      this.peso = heavy;
    }
    void setRaza (String modelo){
      this.raza=modelo;
    }
    public String toString(){
      String ficha="";
      ficha= "Nombre: "+this.nombre+"\n";
      if (this.sexo == true){
        ficha += "Sexo: hembra\n";
      } else {
        ficha +="Sexo: Macho\n";
      }
        ficha +="Raza: "+this.raza+"\n";
      if (this.edad >=0){
        ficha += "Edad: "+this.edad+"\n";
      }
      if (this.peso >=0){
        ficha += "Peso: "+this.peso+"\n";
      }
      return ficha;
    }
}
