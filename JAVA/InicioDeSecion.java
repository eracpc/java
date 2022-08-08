import java.util.Scanner;

public class InicioDeSecion {
  public static void main(String[] args) {
  try (Scanner in = new Scanner(System.in)){
   String nombre="", pasword="";
   System.out.println(" Ingrese su usuario: ");
   nombre = in.nextLine();
   System.out.println(" Ingrese su pasword: ");
   pasword = in.nextLine();

   if (nombre.equals("Roberto") && pasword.equals("12345678")) {
     System.out.println("Inicio de Sesion Correcto");
   } else {
      System.out.println("Usuario o Pasword incorrectos");
   }
    }
  }
}
