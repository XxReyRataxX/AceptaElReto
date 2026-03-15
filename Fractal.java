// Esquema de la entrada: fin de la entrada
import java.util.*;

public class Fractal {

  static Scanner in;

  public static boolean casoDePrueba() {

    if (in.hasNext())
      return false;
    else {
      // CÓDIGO PRINCIPAL AQUÍ (incluyendo
      // la lectura del caso de prueba)
      // Procesa un único caso leyendo con
      // in.next*()

      return true;
    }

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    while(casoDePrueba())
      ;

  } // main

} // class Solution
