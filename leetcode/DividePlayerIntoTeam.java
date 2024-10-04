import java.util.*;

public class DividePlayerIntoTeam {
    public static int dividePlayerIntoTeam(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum % (n / 2) != 0) {
            return -1;
        }

        List<Integer> li = new ArrayList<>();
        for (int i : arr) {
            li.add(i);
        }

        int rem;
        int result = 0;
        int value = sum / (n / 2);

        for (int i = 0; i < li.size();) {
            int getValue = li.get(i);
            li.remove(Integer.valueOf(getValue));

            rem = value - getValue;

            if (!li.contains(rem)) {
                return -1;
            } else {
                result += (getValue * rem);
                li.remove(Integer.valueOf(rem));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr = input.split(",");
        int size = strArr.length;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int result = dividePlayerIntoTeam(arr);
        System.out.println(result);
        sc.close();
    }
}
