import java.util.Scanner;

public class AniaAndMinimizing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] arr = sc.next().toCharArray(); 

        if (k == 0) {
            System.out.println(arr);
            return;
        }

        if (n == 1 && k >= 1) {
            System.out.println("0");
            return;
        }

        int j = (arr[0] != '1') ? 1 : 0; 
        if (arr[0] != '1') {
            arr[0] = '1';
        }

        for (int i = 1; i < n && j < k; i++) {
            if (arr[i] == '0') {
                continue;
            } else {
                arr[i] = '0';
                j++;
            }
        }

        System.out.println(arr);
        sc.close();
    }
}
