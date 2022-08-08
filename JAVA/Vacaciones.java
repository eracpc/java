import java.util.Scanner;
public class Vacaciones {
  public static void main(String[] args) {
    
    try (Scanner in = new Scanner(System.in)){
     String nombre = "";
     int clave = 0 , antiguedad = 0;
    System.out.println("**********************************************************");
     System.out.println("* Bienvenidos al Sistema Vacacional de Coca-Cola Company *");
     System.out.println("**********************************************************");

    System.out.println(" ¿Cual es su Nombre? ");
    nombre = in.nextLine();
    System.out.println(" ¿Cual es su clave de Departamento? ");
    clave = in.nextInt();
    System.out.println(" ¿Cuantos años lleva en la Empresa? ");
    antiguedad = in.nextInt();

    if (clave == 1) {
      if (antiguedad == 1) {
        System.out.println(nombre + " tiene derecho a 6 dias de vacaciones ");
      }
    else {
        if (antiguedad >= 2 && antiguedad <=6) {
          System.out.println(nombre + " tiene derecho a 14 dias de vacaciones ");
        }
        else{
           if (antiguedad >= 7) {
            System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");}
           else{
             System.out.println(nombre + " Aun no tiene derecho de vacaciones ");
          }  
        }
      }
    } 
    else {
    if (clave == 2) {
       if (antiguedad == 1) {
        System.out.println(nombre + " tiene derecho a 7 dias de vacaciones ");
      }
       else {
        if (antiguedad >= 2 && antiguedad <=6) {
          System.out.println(nombre + " tiene derecho a 15 dias de vacaciones ");
        }
        else{
          if (antiguedad >= 7) {
            System.out.println(nombre + " tiene derecho a 22 dias de vacaciones");}
          else{
             System.out.println(nombre + " Aun no tiene derecho de vacaciones ");
          }  
        }
      }
     }
    else {
    if (clave == 3) {
       if (antiguedad == 1) {
        System.out.println(nombre + " tiene derecho a 10 dias de vacaciones ");
      } 
      else {
        if (antiguedad >= 2 && antiguedad <=6) {
          System.out.println(nombre + " tiene derecho a 20 dias de vacaciones ");
        }
        else{
          if (antiguedad >= 7) {
            System.out.println(nombre + " tiene derecho a 30 dias de vacaciones");}
          else{
             System.out.println(nombre + " Aun no tiene derecho de vacaciones ");
         }  
        }
       }   
      } 
     }
    }
   }
  }
}
