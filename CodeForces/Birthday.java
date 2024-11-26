import java.util.*;
public class Birthday{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		long n = sc.nextLong();
		List<Integer> a = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		Collections.sort(a);
		for(int i = 0; i < n; i += 2) {
			System.out.print(a.get(i) + " ");
		}
		if(n % 2 != 0) {
			n--;
		}
		for(int i = (int)n - 1; i >= 1; i -= 2) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
	}
}
