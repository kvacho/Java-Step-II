package Second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Braces {
    public static void run() {
        // 2
        System.out.println("2. შემოიყვანეთ რიცხვი:\n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<String> result = make(n);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> make(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            result.add(""); // ცარიელი
            return result;
        }

        StringBuilder sb = new StringBuilder();
        form(n, result, sb, 0, 0);
        return result;
    }

    public static void form(int n, List<String> result, StringBuilder sb, int open, int close) {
        if (sb.length() == n * 2) {
            result.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append('{');
            form(n, result, sb, open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append('}');
            form(n, result, sb, open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}