import java.util.Scanner;
public class Palindrometer {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String save = n;
        boolean p = false;
        while (!n.equals("0")) {
            while (!p) {
                if (isP(n)) {
                    p = true;
                } else {
                    int len = n.length();
                    n = String.valueOf(Integer.parseInt(n) + 1);
                    while (len != n.length()) {
                        n = "0" + n;
                    }
                }
            }
            System.out.println(Integer.parseInt(n) - Integer.parseInt(save));
            p = false;
            n = scanner.nextLine();
            save = n;
        }
    }
    public static boolean isP (String t) {
        for (int i = 0; i < (t.length() / 2) + 1; ++i) {
            if (t.charAt(i) != t.charAt(t.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
