package First;

import java.util.Scanner;

public class Palindrome {
    public static void run() {
        // 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. შემოიყვანეთ სტრინგი:\n");
        String s = scanner.nextLine();

        if (canBePalindromed(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPalindrome(String s, int leftPointer, int rightPointer) {
        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    private static boolean canBePalindromed(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return isPalindrome(s, leftPointer + 1, rightPointer) || isPalindrome(s, leftPointer, rightPointer - 1);
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
