public class ejercicio6_9 { 
  public static void main(String[] args) {
    System.out.println("Numeros pares entre 0 y 100\n");
    int numero;
    int acumulador=0;
    do { 
      numero = (int)(Math.random()*100+1); 
      if (numero%2==0) {
        System.out.println(numero);
        acumulador++;
      }  
    } while (numero != 24);
    System.out.print("Se han generado: "+acumulador +" numeros pares");
  } 
}
