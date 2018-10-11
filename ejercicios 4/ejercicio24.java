import java.util.Scanner;

public class ejercicio24 {
  public static void main(String[]args) {
  
  int cargo;
  
  
  Scanner escanerEntrada = new Scanner(System.in);
  System.out.println("¿Que cargo ostenta el empleado?(1-3)\n");
  System.out.println("1. Programador Junior\n");
  System.out.println("2. Programador Senior\n");
  System.out.println("3. Jefe de Proyecto\n");
  cargo = escanerEntrada.nextInt();
  System.out.println("¿Cuantos dias de  viaje ha hecho visitando clientes?\n");
  int viajes;
  viajes = escanerEntrada.nextInt();
  int estadoCivil;
  
  System.out.println("¿Esta casado?(1 para indicar si, 0 para indicar no)\n");
  
  estadoCivil = escanerEntrada.nextInt();
  
  double salario;
  double irpf;
  double sueldoFinal;
  double sueldoBase;
    switch (cargo) {

      case 1:
        sueldoBase = 950;
        salario =  950 + (viajes * 30);
        if (estadoCivil == 1) {
          irpf = salario * 0.2;
        } else {
          irpf = salario * 0.25;
        }   
        sueldoFinal = salario - irpf;
        System.out.println("Detalle Del Sueldo:\n");
        System.out.printf("Sueldo base:        %.2f\n",sueldoBase);
        System.out.printf("Viajes:               %d\n",viajes);
        System.out.println("----------------------------\n");
        System.out.printf("Sueldo Bruto:       %.2f\n",salario);
        System.out.printf("Retención IRPF:     %.2f\n",irpf);
        System.out.printf("Sueldo neto:        %.2f\n",sueldoFinal);
        
        break;
      case 2:  
        sueldoBase = 1200;
        salario = 1200 + (viajes *30);
        if (estadoCivil == 1) {
          irpf = salario * 0.2;
        } else {
          irpf = salario * 0.25;
        }    
        sueldoFinal = salario - irpf;
        System.out.println("Detalle Del Sueldo:\n");
        System.out.printf("Sueldo base:        %.2f\n",sueldoBase);
        System.out.printf("Viajes:               %d\n",viajes);
        System.out.println("----------------------------\n");
        System.out.printf("Sueldo Bruto:       %.2f\n",salario);
        System.out.printf("Retención IRPF:      %.2f\n",irpf);
        System.out.printf("Sueldo neto:        %.2f\n",sueldoFinal);
      
      break;
      case 3:
        sueldoBase = 1600;
        salario = 1600 + (viajes * 30);
        if (estadoCivil == 1) {
          irpf = salario * 0.2;
        } else {
          irpf = salario * 0.25;  
        }  
        sueldoFinal = salario - irpf;
        System.out.println("Detalle Del Sueldo:\n");
        System.out.printf("Sueldo base:        %.2f\n",sueldoBase);
        System.out.printf("Viajes:               %d\n",viajes);
        System.out.println("----------------------------");
        System.out.printf("Sueldo Bruto:       %.2f\n",salario);
        System.out.printf("Retención IRPF:      %.2f\n",irpf);
        System.out.println("----------------------------\n");
        System.out.printf("Sueldo neto:        %.2f\n",sueldoFinal);
      
      break;
    }
  }
}
//Creado por Rafael Montes
