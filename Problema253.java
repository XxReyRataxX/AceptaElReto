import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Problema253 {

  static Scanner in;

  private static boolean casoDePrueba() {
    if (!in.hasNextInt()) {
      return false;
    }

    int n = in.nextInt();
    int k = in.nextInt();
    int s = in.nextInt();
    int e = in.nextInt();

    if (n == 0 && k == 0 && s == 0 && e == 0) {
      return false;
    }

    int total = n * n;
    int[] salto = new int[total + 1];

    for (int i = 0; i < s; i++) {
      int desde = in.nextInt();
      int hasta = in.nextInt();
      salto[desde] = hasta;
    }

    for (int i = 0; i < e; i++) {
      int desde = in.nextInt();
      int hasta = in.nextInt();
      salto[desde] = hasta;
    }

    int[] dist = new int[total + 1];
    Arrays.fill(dist, -1);

    Queue<Integer> cola = new ArrayDeque<>();
    dist[1] = 0;
    cola.offer(1);

    while (!cola.isEmpty()) {
      int actual = cola.poll();

      if (actual == total) {
        break;
      }

      for (int dado = 1; dado <= k; dado++) {
        int siguiente = actual + dado;
        if (siguiente > total) {
          continue;
        }

        if (salto[siguiente] != 0) {
          siguiente = salto[siguiente];
        }

        if (dist[siguiente] == -1) {
          dist[siguiente] = dist[actual] + 1;
          cola.offer(siguiente);
        }
      }
    }

    System.out.println(dist[total]);
    return true;
  }

  public static void main(String[] args) {
    in = new Scanner(System.in);
    while (casoDePrueba()) {
      // Procesamos todos los casos hasta 0 0 0 0
    }
  }
}
