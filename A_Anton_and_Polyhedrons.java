import java.util.*;

/**
 * A_Anton_and_Polyhedrons
 */
public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String str = in.next();

            switch (str) {
                case "Tetrahedron" -> ans = ans + 4;
                case "Cube" -> ans = ans + 6;
                case "Octahedron" -> ans = ans + 8;
                case "Dodecahedron" -> ans = ans + 12;
                case "Icosahedron" -> ans = ans + 20;
            }
        }

        System.out.println(ans);
    }
}