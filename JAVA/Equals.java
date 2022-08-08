import java.util.Scanner;

public class Equals {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      String nombreuno = " ", nombredos = " ";
      System.out.println(" ¿Cual es el Primer Nombre? ");
      nombreuno = in.nextLine();
      System.out.println(" ¿Cual es el Segundo Nombre? ");
      nombredos = in.nextLine();
    
    if (nombreuno.equalsIgnoreCase(nombredos)) {
   System.out.println("Los nombre son iguales");
  } else {
   System.out.println("Los nombres son diferentes");
  }
    }
  }
}
