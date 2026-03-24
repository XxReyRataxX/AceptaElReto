// Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class Problema775 {

  static Scanner in;

  public static boolean casoDePrueba() {

    // LEER CASO DE PRUEBA
    if (!in.hasNextLong()) {
      return false;
    }

    long primero = in.nextLong();

    // Una lista vacia (solo 0) marca el final de la entrada.
    if (primero == 0) {
      return false;
    }

    long respuesta = primero;
    long anterior = primero;

    while (true) {
      long actual = in.nextLong();
      if (actual == 0) {
        break;
      }

      respuesta = Math.max(respuesta, anterior + actual);
      anterior = actual;
    }

    System.out.println(respuesta);
    return true;

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    while(casoDePrueba())
      ;

  } // main

} // class Solution