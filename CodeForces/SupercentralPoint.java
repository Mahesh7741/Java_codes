import java.util.*;
public class SupercentralPoint{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int t = 1;
		while (t-- > 0) {
			long n = sc.nextLong();
			long[][] arr = new long[(int)n][2];
			for (int i = 0; i < n; i++) {
				arr[i][0] = sc.nextLong();
				arr[i][1] = sc.nextLong();
			}
			long count = 0;
			for (int i = 0; i < n; i++) {
				boolean hasRight = false, hasLeft = false;
				boolean hasLower = false, hasUpper = false;
				for (int j = 0; j < n; j++) {
					if (i != j) {
						if (arr[j][0] > arr[i][0] && arr[i][1] == arr[j][1]) hasRight = true;
						if (arr[j][0] < arr[i][0] && arr[i][1] == arr[j][1]) hasLeft = true;
						if (arr[j][0] == arr[i][0] && arr[i][1] > arr[j][1]) hasUpper = true;
						if (arr[j][0] == arr[i][0] && arr[i][1] < arr[j][1]) hasLower = true;
					}
				}
				if (hasLeft && hasRight && hasLower && hasUpper) count++;
			}
			System.out.println(count);
		}
	}
}
