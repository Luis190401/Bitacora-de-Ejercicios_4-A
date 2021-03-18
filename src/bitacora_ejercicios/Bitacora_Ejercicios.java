package bitacora_ejercicios;
/**
 * @author 
 * Dzul Noh Jose Julio - 19070047 
 * Llanes Barrera Luis Angel - 19070023
 * Poot Pool Riger Emmanuel - 19070067 
 * Semestre: Cuarto   Grupo: A
 */
import java.util.Scanner;
public class Bitacora_Ejercicios {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        Soluciones s1 = new Soluciones();
        int opc;
        do {
            System.out.println("---------------------------------");
            System.out.println("|              MENU             |");
            System.out.println("| 1.- Euler                     |");
            System.out.println("| 2.- Ecuacion Cuadratica       |");
            System.out.println("---------------------------------");
            System.out.print("Seleccione Una Opcion: ");
            opc = xd.nextInt();
            System.out.println("\n************************************\n");
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el valor de x: ");
                    int x = xd.nextInt();
                    System.out.print("Ingrese el valor de n: ");
                    int n = xd.nextInt();
                    s1.euler(x, n);
                    System.out.println("");
                    System.out.println("El resultado de euler elevado a " + x + " es: " + s1.geteuler());
                    System.out.println("El resultado de euler elevado a -" + x + " es: " + (1 / s1.geteuler()));
                    break;
                    
                case 2:
                    System.out.print("Ingrese el valor de a: ");
                    int a = xd.nextInt();
                    System.out.print("Ingrese el valor de b: ");
                    int b = xd.nextInt();
                    System.out.print("Ingrese el valor de c: ");
                    int c = xd.nextInt();
                    s1.ecuacion1(a, b, c);
                    s1.ecuacion2(a, b, c);
                    break;
                    
                default:
                    System.out.println("Opcion Invalida");
                    break;
                    
            }
            System.out.println("\n************************************\n");
            System.out.println("Desea Volver Al Menu");
            System.out.println("1: SI    Otro N°: NO");
            System.out.print("R: ");
            opc = xd.nextInt();
            System.out.println("\n************************************\n");
        } while (opc == 1);
    }
}
