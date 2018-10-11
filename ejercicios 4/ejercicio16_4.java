import java.util.Scanner;
public class ejercicio16_4 {
  public static void main (String args[]) {
    Scanner escanerEntrada = new Scanner(System.in);
    System.out.println("Averigua si tu pareja te esta siendo infiel:(contesta con v y f)");
    String respuesta;
    int puntuacion = 0;
    respuesta = escanerEntrada.nextLine();
    System.out.println("1.Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
    respuesta = escanerEntrada.nextLine();
    if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("2.Ha aumentado sus gastos de vestuario ");
    respuesta = escanerEntrada.nextLine();
     if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("3.Ha perdido el interés que mostraba anteriormente por ti");
     respuesta = escanerEntrada.nextLine();
     if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("4.Ahora se afeita y se asea con más frecuencia(si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si esmujer)");
     respuesta = escanerEntrada.nextLine();
     if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("5.No te deja que mires la agenda de su teléfono móvil");
    respuesta = escanerEntrada.nextLine();
    if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("6.A veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
    respuesta = escanerEntrada.nextLine();
    if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("7.Últimamente se preocupa más en cuidar la línea y/o estarbronceado/a");
    respuesta = escanerEntrada.nextLine();
    if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("8.Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuesta = escanerEntrada.nextLine();
    if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("9.Has notado que últimamente se perfuma más");
    respuesta = escanerEntrada.nextLine();
    if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    System.out.println("10.Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuesta = escanerEntrada.nextLine();
    if (respuesta.equals("v")) {
      puntuacion +=3;
    }
    if (puntuacion <= 10) {
      System.out.print("Ehnorabuena tu pareja te es fiel");
    } else if ((puntuacion >= 11) && (puntuacion <= 22)) {
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if ((puntuacion >= 23) && (puntuacion >= 30)) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      
    }
  }
}
