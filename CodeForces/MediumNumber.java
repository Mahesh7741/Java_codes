import java.util.*;
public class MediumNumber{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T = sc.nextInt();
		while (T-- > 0) {
			long[] arr = new long[3];
			arr[0] = sc.nextLong();
			arr[1] = sc.nextLong();
			arr[2] = sc.nextLong();
			Arrays.sort(arr);
			System.out.println(arr[1]);
		}
	}
}
