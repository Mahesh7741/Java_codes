import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\+"); 
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]); 
        }

        Arrays.sort(intArr);
        for (int i = 0; i < intArr.length - 1; i++) {
            System.out.print(intArr[i] + "+");
        }
        System.out.print(intArr[intArr.length - 1]); 
        sc.close();
    }
}
