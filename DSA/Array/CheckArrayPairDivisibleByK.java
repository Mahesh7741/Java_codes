import java.util.Scanner;
/*
public class CheckArrayPairDivisibleByK {

    public static boolean checkPairDivisibleByK(int[] arr, int k) {
        int count = 0;
        int size = arr.length;
        boolean[] used = new boolean[size]; // To mark used elements
        
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == -1 || used[i]) { // Skip if element is -1 or already used
                continue;
            }
            for (int j = i + 1; j < size; j++) {
                if (arr[j] == -1 || used[j]) { // Skip if element is -1 or already used
                    continue;
                }
                int sum = arr[i] + arr[j];
                if (sum % k == 0) {
                    used[i] = used[j] = true; // Mark the pair as used
                    count++;
                    break; // Move to the next element i after finding a pair
                }
            }
        }
        return count == size / 2; // Check if exactly half of the elements formed pairs
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        
        boolean result = checkPairDivisibleByK(arr, k);
        System.out.println("Can pairs be formed: " + result);
        
        sc.close();
    }
}
*/
import java.util.Scanner;

public class CheckArrayPairDivisibleByK {

    public static boolean checkPairDivisibleByK(int[] arr, int k) {
        int size = arr.length;
        if (size % 2 != 0) {
            return false; 	 	
        }
        int[] freq = new int[k];

        for (int i = 0; i < size; i++) {
            int remainder = arr[i] % k;
            if (remainder < 0) { 
                remainder += k;
            }
            freq[remainder]++;
        }

        if (freq[0] % 2 != 0) {
            return false; 
        }

        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) { 
                if (freq[i] % 2 != 0) {
                    return false; 
                }
            } else {
                if (freq[i] != freq[k - i]) {
                    return false; 
                }
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        boolean result = checkPairDivisibleByK(arr, k);
        System.out.println("Can pairs be formed: " + result);

        sc.close();
    }
}
