import java.util.Scanner;
public class Introdicirdatos {
public static void main(String args [] ) {
 
  try (Scanner in = new Scanner(System.in)) {

    String nombre = " ";
    int numuno = 0, numdos = 0, resultado = 0;
    
    System.out.println("Cual es tu nombre?");
    nombre = in.nextLine();

    System.out.println("dame el primer numero para la suma ");
    numuno = in.nextInt();

    System.out.println("dame el segundo numero para la suma ");
    numdos = in.nextInt();

    resultado = numuno + numdos;
    System.out.println("HOLA " + nombre + " El resultado de la suma es: " + resultado);
  }
 }
}
