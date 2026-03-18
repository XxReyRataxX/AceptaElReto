// Esquema de la entrada: número de casos
import java.util.*;

public class Problema572{

static Scanner in;

  public static void casoDePrueba() {
    boolean cero = false;
    boolean mayor9 = false;
        for (int i = 0; i < 5; i++) {
            double dato = in.nextDouble();
            if (dato == 0.0) cero = true;
            if (dato >= 9.0) mayor9 = true;
        }

        if (cero && !mayor9) {
          System.out.println("SUSPENSO DIRECTO");
        } else {
          System.out.println("MEDIA");
        }

  } // casoDePrueba

  public static void main(String[] args) {

    in = new java.util.Scanner(System.in);
    in.useLocale(Locale.US);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();

  } // main

} // class Solution

