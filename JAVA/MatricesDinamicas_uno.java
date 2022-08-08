import java.util.Scanner;
public class MatricesDinamicas_uno {
public static void main(String[] args) {
  int filas = 0, columnas = 0, Contador = 1;
  try(Scanner in = new Scanner(System.in)){
    
    System.out.println("¿cuantas Filas Desea?");
    filas = in.nextInt();
    
    System.out.println("¿cuantas Columnas Desea?");
    columnas =in.nextInt();

    int numeros [][] = new int [filas][columnas];
    for (int j = 0; j < filas; j++) {
      for (int i = 0; i < columnas; i++) {
       numeros[j][i] = Contador;
       Contador++;
       System.out.print("[" + numeros[j][i] + "]");
      }
      
      System.out.println("");
    }

  }
 }
}