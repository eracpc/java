import java.util.Scanner;
public class Cocacola {
  public static void main(String[] args) {
    
    try ( Scanner in = new Scanner(System.in)){
    String nombre = " ";
    int clave = 0, antiguedad = 0;
    
    System.out.println(" ¿Cual es su Nombre? ");
    nombre = in.nextLine();

    System.out.println(" ¿Cual es su clave de Departamento? ");
    clave = in.nextInt();

    System.out.println(" ¿Cuantos años lleva en la Empresa? ");
    antiguedad = in.nextInt();

    

    if (clave == 1 && antiguedad == 1 ) {
      System.out.println(nombre + " tiene derecho a 6 dias de vacaciones ");
    } 
    if (clave == 1 && antiguedad > 1 && antiguedad <= 6) {
      System.out.println(nombre + " tiene derecho a 14 dias de vacaciones ");
    } 
    if (clave == 1 && antiguedad >= 7 ) {
      System.out.println(nombre + " tiene derecho a 20 dias de vacaciones ");
    } 
    
    if (clave == 2 && antiguedad == 1 ) {
      System.out.println(nombre + " tiene derecho a 7 dias de vacaciones ");
    } 
    if (clave == 2 && antiguedad > 1 && antiguedad <= 6) {
      System.out.println(nombre + " tiene derecho a 15 dias de vacaciones ");
    } 
    if (clave == 2 && antiguedad >= 7 ) {
      System.out.println(nombre + " tiene derecho a 22 dias de vacaciones ");
    } 


    if (clave == 3 && antiguedad == 1 ) {
      System.out.println(nombre + " tiene derecho a 10 dias de vacaciones ");
    } 
    if (clave == 3 && antiguedad > 1 && antiguedad <= 6) {
      System.out.println(nombre + " tiene derecho a 20 dias de vacaciones ");
    } 
    if (clave == 3 && antiguedad >= 7 ) {
      System.out.println(nombre + " tiene derecho a 30 dias de vacaciones ");
    } 
    }
  }
}