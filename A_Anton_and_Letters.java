import java.util.*;

/**
 * A_Anton_and_Letters
 */
public class A_Anton_and_Letters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        str = str.replace("{", "");
        str = str.replace("}", "");
        str = str.replaceAll(", ", "");
        str = str.trim();

        Set<Character> chr = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            chr.add(str.charAt(i));
        }
        System.out.println(chr.size());
    }
}