import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int serejaPoints = 0;
        int dimaPoints = 0;
        int left = 0;
        int right = n - 1;
        boolean turn = true;

        while (left <= right) {
            if (a[left] >= a[right]) {
                if (turn) {
                    serejaPoints += a[left];
                } else {
                    dimaPoints += a[left];
                }
                left++;
            } else {
                if (turn) {
                    serejaPoints += a[right];
                } else {
                    dimaPoints += a[right];
                }
                right--;
            }
            turn = !turn;
        }

        System.out.println(serejaPoints + " " + dimaPoints);
        sc.close();
    }
}
