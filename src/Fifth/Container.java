package Fifth;

import java.util.Scanner;

public class Container {
    public static void run() {
        // 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("შემოიყვანეთ არეის ზომა:\n");
        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("შემოიყვანეთ მე-" + (i + 1) + " რიცხვი:\n");
            int temp = scanner.nextInt();

            arr[i] = temp;
        }

        int maxS = getMaxS(arr);
        System.out.println("მაქსიმალური შესაძლო ფართობი: " + maxS);
    }

    public static int getMaxS(int[] arr) {
        int firstPointer = 0;
        int secondPointer = arr.length - 1;
        int maxS = 0;
        int temp = 0;

        while(secondPointer > firstPointer) {
            if (arr[firstPointer] > arr[secondPointer]) {
                temp = (secondPointer - firstPointer) * Math.min(arr[firstPointer], arr[secondPointer]);
                if (temp > maxS) {
                    maxS = temp;
                }
                secondPointer--;
            } else {
                temp = (secondPointer - firstPointer) * Math.min(arr[firstPointer], arr[secondPointer]);
                if (temp > maxS) {
                    maxS = temp;
                }
                firstPointer++;
            }
        }

        return maxS;
    }
}
