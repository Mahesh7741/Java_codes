package DSA.Array;

public class SecondLargestElementInArray {
    public static int secondLargestElementInArray(int arr[], int n) {
        if (n == 1) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int secMax = -1;
        for (int i = 0; i < n; i++) {
            if ((arr[i] > secMax) && (arr[i] != max)) {
                secMax = arr[i];
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 56, 90 };
        System.out.println(secondLargestElementInArray(arr, arr.length));
    }
}
