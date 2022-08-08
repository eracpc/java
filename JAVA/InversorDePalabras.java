import java.util.Scanner;

public class InversorDePalabras {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        try (Scanner entrada = new Scanner(System.in)) {
          System.out.print("Escribe una palabra o frase: ");
          palabra = entrada.nextLine();
        }

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
        }

        System.out.print("Palabra Invertida " + palabraInvertida);
        System.out.println("");
    }
}