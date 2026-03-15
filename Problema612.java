import java.util.*;

public class Problema612 {

    static Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext()) {
            return false;
        }

        // Usamos long para evitar desbordamientos en los cálculos de r*r
        long r = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();

        long centroX = 0;
        long centroY = 0;
        int circulosDondeEsta = 0;

        while (r >= 1) {
            long dx = x - centroX;
            long dy = y - centroY;

            // 1. Comprobamos si el punto está dentro del círculo de este nivel
            if (dx * dx + dy * dy <= r * r) {
                circulosDondeEsta++;
            }

            // 2. Decidimos hacia qué círculo hijo movernos
            // Según el enunciado, los hijos están en (R,0), (-R,0), (0,R), (0,-R)
            if (Math.abs(dx) > Math.abs(dy)) {
                // El punto está más desplazado horizontalmente, movemos centroX
                if (x > centroX) centroX += r;
                else centroX -= r;
            } else if (Math.abs(dy) > Math.abs(dx)) {
                // El punto está más desplazado verticalmente, movemos centroY
                if (y > centroY) centroY += r;
                else centroY -= r;
            } else {
                // Si está en diagonal perfecta, elegimos una rama (ej. X)
                // siempre que no estemos ya en el centro exacto
                if (x > centroX) centroX += r;
                else if (x < centroX) centroX -= r;
                else break; // Estamos en el centro y r/2 será < r
            }

            // 3. El radio de los hijos es la división entera del radio actual
            r /= 2;
            
            // Si el punto se aleja demasiado del nuevo centro posible, podemos podar
            // (Opcional, pero ayuda contra el TLE)
            long nDx = x - centroX;
            long nDy = y - centroY;
            if (Math.abs(nDx) > r && Math.abs(nDy) > r) break;
        }

        System.out.println(circulosDondeEsta);
        return true;
    }

    public static void main(String[] args) {
        // Usamos un Scanner con un buffer rápido
        in = new Scanner(System.in);
        while (casoDePrueba());
    }
}