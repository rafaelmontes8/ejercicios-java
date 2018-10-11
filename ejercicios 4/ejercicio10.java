import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[]args) {
    int mes;
    int diaNacimiento;

    Scanner escanerEntrada = new Scanner(System.in);

    System.out.println("Introduce tu mes de nacimiento(el numero):");
    mes = escanerEntrada.nextInt();


    System.out.println("Introduce tu dia nacimiento(el numero):");
    diaNacimiento = escanerEntrada.nextInt();

    switch (mes) {
      case 1: //enero
        if ((diaNacimiento >= 21) && (diaNacimiento <= 31)) {
        System.out.println("Tu signo del zodiaco es acuario");
      } else if ((diaNacimiento >=1) && (diaNacimiento <= 20)){
        System.out.println("Tu signo del zodiaco es capricornio");
      }
        break;
      case 2: //febrero
        if ((diaNacimiento >= 1) && (diaNacimiento <= 19)) {
        System.out.println("Tu signo del zodiaco es acuario");
      } else if ((diaNacimiento >=20) && (diaNacimiento <= 29)){
        System.out.println("Tu signo del zodiaco es piscis");
      }
        break;
      case 3: //marzo
        if ((diaNacimiento >= 1) && (diaNacimiento <= 20)) {
        System.out.println("Tu signo del zodiaco es piscis");
      } else if ((diaNacimiento >=21) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es aries");
      }
        break;
      case 4: //abril
        if ((diaNacimiento >= 1) && (diaNacimiento <= 20)) {
        System.out.println("Tu signo del zodiaco es aries");
      } else if ((diaNacimiento >=21) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Tauro");
      }
        break;
      case 5: //mayo
        if ((diaNacimiento >= 1) && (diaNacimiento <= 21)) {
        System.out.println("Tu signo del zodiaco es Tauro");
      } else if ((diaNacimiento >=22) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Geminis");
      }
        break;
      case 6: //junio
        if ((diaNacimiento >= 1) && (diaNacimiento <= 22)) {
        System.out.println("Tu signo del zodiaco es Geminis");
      } else if ((diaNacimiento >=23) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Cancer");
      }
        break;
      case 7: //julio
        if ((diaNacimiento >= 1) && (diaNacimiento <= 23)) {
        System.out.println("Tu signo del zodiaco es Cancer");
      } else if ((diaNacimiento >=24) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Leo");
      }
        break;
      case 8: //agosto
        if ((diaNacimiento >= 1) && (diaNacimiento <= 23)) {
        System.out.println("Tu signo del zodiaco es Leo");
      } else if ((diaNacimiento >=24) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Virgo");
      }
        break;
      case 9: //septiembre
        if ((diaNacimiento >= 1) && (diaNacimiento <= 23)) {
        System.out.println("Tu signo del zodiaco es Virgo");
      } else if ((diaNacimiento >=24) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Libra");
      }
        break;
      case 10: //octubre
        if ((diaNacimiento >= 1) && (diaNacimiento <= 23)) {
        System.out.println("Tu signo del zodiaco es Libra");
      } else if ((diaNacimiento >=24) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Escorpio");
      }
        break;
      case 11: //noviembre
        if ((diaNacimiento >= 1) && (diaNacimiento <= 22)) {
        System.out.println("Tu signo del zodiaco es Escorpio");
      } else if ((diaNacimiento >=23) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Sagitario");
      }
        break;
      case 12: //diciembre
        if ((diaNacimiento >= 1) && (diaNacimiento <= 21)) {
        System.out.println("Tu signo del zodiaco es Sagitario");
      } else if ((diaNacimiento >=22) && (diaNacimiento <= 31)){
        System.out.println("Tu signo del zodiaco es Capricornio");
      }
        break;


    }
  }
}
//Creado por Rafael Montes Expósito
