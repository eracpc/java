public class SerieNumUno {
  public static void main(String[] args) {
    int i=0;
    System.out.print("Serie con For: ");
    for (i = 1; i <= 10; i++) {
      if (i<10) {
        System.out.print(i + ",");
      } else {
        System.out.println(i);
      }
    }
    i=1;
    System.out.println("");
    System.out.print("Serie con While: ");
    while (i <= 10) {
      if ( i < 10) {
        System.out.print(i + ",");
      } else {
        System.out.println(i);
      } 
      i++;
    }
    i=1;
    System.out.println("");
    System.out.print("Serie con Do-While: ");

    do {
      if ( i < 10) {
        System.out.print(i + ",");
      } else {
        System.out.println(i);
      } 
      i++;
    } while (i <= 10);
    
  }
}
