public class Operacionesswitch {
public static void main(String[] args) {
  int num_uno = 5, num_dos = 20, resultado = 0, parametro = 1;
  switch (parametro) {
    case 1:
      resultado = num_uno + num_dos;
      System.out.println("la Suma es: " + resultado);
      break;
    case 2:
      resultado = num_uno - num_dos;
      System.out.println("la Resta es: " + resultado);  
      break;
    case 3:
      resultado = num_uno * num_dos;
      System.out.println("la Multiplicasion es: " + resultado);  
      break;
    case 4:
      resultado = num_uno / num_dos;
      System.out.println("la Division es: " + resultado);  
      break;    
      default:
      System.out.println("El codigo no es valido");
    }
  }
}