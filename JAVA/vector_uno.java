import java.util.Scanner;
public class vector_uno {
  public static void main(String[] args) {
    int longitud = 0;
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("¿cuantos numeros deas guardar?");
      longitud = in.nextInt();
       
      int numeros [] =  new int[longitud];

      for (int i = 0; i < numeros.length; i++) {
        System.out.println("Por favor dame el valor # " + (i + 1));
        numeros[i] = in.nextInt();
      }
       for (int i = 0; i < numeros.length; i++) {
         System.out.print("[" + numeros[i] + "]");
        }
    }
  }
}
