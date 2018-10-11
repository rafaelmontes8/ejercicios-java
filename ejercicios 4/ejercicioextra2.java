import java.util.Scanner;

public class ejercicioextra2 {
  public static void main(String[]args) {
    int mes;
    int dia;
    int año;

    Scanner escanerEntrada = new Scanner(System.in);

    System.out.println("Introduce el mes(el numero):");
    mes = escanerEntrada.nextInt();


    System.out.println("Introduce el dia(el numero):");
    dia = escanerEntrada.nextInt();
    System.out.println("Introduce el año(el numero)");
    año =escanerEntrada.nextInt();
    
    switch (mes) {
      case 1: 
      //enero
        if ((dia >= 1) && (dia <= 31)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 2: 
      //febrero
        if ((dia >= 1) && (dia <= 28)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");     
      }
        break;
      case 3: 
      //marzo
        if ((dia >= 1) && (dia <= 31)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 4: 
      //abril
        if ((dia >= 1) && (dia <= 30)) {
          System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 5: 
      //mayo
        if ((dia >= 1) && (dia <= 31)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 6: 
      //junio
        if ((dia >= 1) && (dia <= 30)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.printf("Tu fecha es incorrecta\n");
      }
        break;
      case 7: 
      //julio
        if ((dia >= 1) && (dia <= 31)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 8: 
      //agosto
        if ((dia >= 1) && (dia <= 31)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 9: 
      //septiembre
        if ((dia >= 1) && (dia <= 30)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 10: 
      //octubre
        if ((dia >= 1) && (dia <= 31)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 11: 
        if ((dia >= 1) && (dia <= 30)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;
      case 12: 
      //diciembre
        if ((dia >= 1) && (dia <= 31)) {
        System.out.printf("La fecha es %d-%d-%d\n",dia,mes,año);
      } else {
        System.out.println("Tu fecha es incorrecta\n");
      }
        break;


    }
  }
}
 
