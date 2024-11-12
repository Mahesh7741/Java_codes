import java.util.Scanner;

public class BearAndFindingCriminals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt() - 1; 
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int counter = arr[a] == 1 ? 1 : 0;

        for (int i = 1; i < n; i++) {
            int right = a + i;
            int left = a - i;

            if (left >= 0 || right < n) {
                if (left >= 0 && right < n) {
                    if (arr[right] == 1 && arr[left] == 1) {
                        counter += 2;
                    }
                } else if (left >= 0) {
                    if (arr[left] == 1) {
                        counter++;
                    }
                } else if (right < n) {
                    if (arr[right] == 1) {
                        counter++;
                    }
                }
            }
        }
        
        System.out.println(counter);
        sc.close();
    }
}
