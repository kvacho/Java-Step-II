package Fourth;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayNumber {
    public static void run() {
        // 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("შემოიყვანეთ არეის ზომა:\n");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("შემოიყვანეთ მე-" + (i + 1) + " რიცხვი:\n");
            int temp = scanner.nextInt();

            if (i == 0 && temp == 0) {
                throw new IllegalArgumentException("პირველი ციფრი ვერ იქნება 0");
            }

            arr[i] = temp;
        }

        int n = arrayToInt(arr) + 1;

        String n2 = Integer.toString(n);

        int[] result = new int[n2.length()];

        for (int i = 0; i < n2.length(); i++) {
            result[i] = n2.charAt(i) - '0';
        }

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }

    public static int arrayToInt(int[] arr) {
        int a = 0;
        int it = 0;

        for (int i = arr.length - 1; i > -1; i--) {
            a += (int) (arr[it] * Math.pow(10, i));
            it++;
        }

        return a;
    }

    public static int[] intStringToArray(String s) {
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = (int) s.charAt(i) - '0';
        }

        return arr;
    }
}
