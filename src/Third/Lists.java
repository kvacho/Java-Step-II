package Third;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {
    public static void run() {
        // 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("3. შემოიყვანეთ პირველი ლისტის ზომა:\n");
        int firstSize = scanner.nextInt();
        List<Integer> firstList = new ArrayList<>(firstSize);

        for (int i = 0; i < firstSize; i++) {
            System.out.println("შემოიყვანეთ მე-" + (i + 1) + " რიცხვი:\n");
            int temp = scanner.nextInt();
            firstList.add(temp);
        }

        System.out.println("შემოიყვანეთ მეორე ლისტის ზომა:\n");
        int secondSize = scanner.nextInt();
        List<Integer> secondList = new ArrayList<>(secondSize);

        for (int i = 0; i < secondSize; i++) {
            System.out.println("შემოიყვანეთ მე-" + (i + 1) + " რიცხვი:\n");
            int temp = scanner.nextInt();
            secondList.add(temp);
        }

        List<Integer> result = new ArrayList<>();

        make(firstList, secondList, result);

        System.out.println(result);
    }

    private static void make(List<Integer> firstList, List<Integer> secondList, List<Integer> result) {
        int first = 0, second = 0;
        while (first < firstList.size() && second < secondList.size()) {
            if (firstList.get(first) < secondList.get(second)) {
                result.add(firstList.get(first));
                first++;
            } else {
                result.add(secondList.get(second));
                second++;
            }
        }

        while (first < firstList.size()) {
            result.add(firstList.get(first));
            first++;
        }

        while (second < secondList.size()) {
            result.add(secondList.get(second));
            second++;
        }
    }
}
