public class Condiciones {
  public static void main(String[] args) {
    int matematicas = 10;
    int biologia = 8;
    int quimica = 7;
    int promedio = 0;
    promedio=(matematicas+biologia+quimica)/3;
    if (promedio>=6) {
      System.out.println("su promedio es: " + promedio +" El Alumno Aprobo");
    } else {
      System.out.println("su promedio es: " + promedio +" El Alumno Reprobo");
    }
  }
}
