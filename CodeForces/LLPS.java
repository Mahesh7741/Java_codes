import java.util.Scanner;

public class LLPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] hs = new int[26];
        for (char ch : str.toCharArray()) {
            hs[ch - 'a']++;
        }
        for (int i = 25; i >= 0; i--) {
            if (hs[i] > 0) {
                for (int j = 0; j < hs[i]; j++) {
                    System.out.print((char)(i + 'a'));
                }
                break;
            }
        }
        
        sc.close();
    }
}
