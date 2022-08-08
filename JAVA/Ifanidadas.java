public class Ifanidadas {
  public static void main(String[] args) {
    int  operacion = 4;
    int  num_uno = 8;
    int  num_dos = 4;
    int  total = 0;
    if (operacion==1) {
      total=num_uno+num_dos;
    System.out.println(total + " es el resultado de la suma");
    } else {
      if (operacion==2) {
      total=num_uno-num_dos;
    System.out.println(total + " es el resultado de la Resta");
      } else {
        if (operacion==3) {
      total=num_uno / num_dos;
    System.out.println(total + " es el resultado de la Division");
        } else {
          if (operacion==4) {
      total=num_uno * num_dos;
    System.out.println(total + " es el resultado de la multiplicacion");
          } else {
            System.out.println("la opcion elegida no existe");
          }
        }
        
      }
    }

  }
}
