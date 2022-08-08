import java.util.Scanner;
public class CadenaDeCaracteres {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)){
    String cadena_original="", cadena_sustraccion="";
    int num_caracteres=0, desde=0, hasta=0;
    System.out.println("Ingrese Una Palabra: ");
    cadena_original = in.nextLine();
    
    num_caracteres = cadena_original.length();

    System.out.println("La Palabra " + cadena_original + " tiene " + num_caracteres + " letras.");

    System.out.println("¿Desde Que Letra Deseas La Nueva Palabra? ");
    desde = in.nextInt();
    System.out.println("¿Hasta Que Letra Deseas La Nueva Palabra? ");
    hasta = in.nextInt();
    
    cadena_sustraccion = cadena_original.substring(desde,hasta);
    System.out.println(cadena_sustraccion);
    }
  }
}
