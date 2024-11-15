import java.util.*;

public class PenchickAndSataySticks {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int[] sortedArr = arr.clone();
            Arrays.sort(sortedArr);

            for (int i = 1; i < size; i++) {
                if (arr[i - 1] - arr[i] == 1) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    i++;
                }
            }

            if (Arrays.equals(arr, sortedArr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
