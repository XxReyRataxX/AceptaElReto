
import java.io.*;

public class Problema188{

  public static String resolverCaso(String linea) {

    linea = linea.trim();
    if (linea.isEmpty()) {
      return "SI";
    }

    String[] palabras = linea.split("\\s+");
    boolean encadena = true;

    for (int i = 0; i < palabras.length - 1; i++) {
      String actual = palabras[i];
      String siguiente = palabras[i + 1];

      if (actual.length() < 2 || siguiente.length() < 2) {
        encadena = false;
        break;
      }

      if (actual.charAt(actual.length() - 2) != siguiente.charAt(0)
          || actual.charAt(actual.length() - 1) != siguiente.charAt(1)) {
        encadena = false;
        break;
      }
    }

    return encadena ? "SI" : "NO";

  }

   // resolverCaso

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder out = new StringBuilder();
    String linea;

    while ((linea = br.readLine()) != null) {
      out.append(resolverCaso(linea)).append('\n');
    }

    System.out.print(out.toString());

  } // main

}



