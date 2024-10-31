import java.util.Scanner;

public class MaximalContinuousRest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String s;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            sb.append(value);
        }
        String m=sb.toString();
		sb.append(m);
		String strMake=sb.toString();
        String[] str =strMake.split("0");
        int maxRest = 0;
        
        for (String segment : str) {
            maxRest = Math.max(maxRest, segment.length());
        }
        System.out.println(maxRest);
        sc.close();
    }
}
