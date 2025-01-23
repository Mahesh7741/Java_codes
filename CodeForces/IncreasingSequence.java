import java.util.*;
public class IncreasingSequence{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		int d = sc.nextInt();
		List<Integer> v = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			v.add(sc.nextInt());
		}
		int ct = 0;
		for(int i = 1; i < n; i++) {
			if(v.get(i) <= v.get(i - 1)) {
				int x = v.get(i - 1) - v.get(i);
				if(x == 0) {
					v.set(i, v.get(i) + d);
					ct++;
				} else if(x % d == 0) {
					int y = x / d;
					ct += y;
					v.set(i, v.get(i) + y * d);
				} else {
					int y = (x / d) + 1;
					ct += y;
					v.set(i, v.get(i) + y * d);
				}
			}
			if(v.get(i) == v.get(i - 1)) {
				v.set(i, v.get(i) + d);
				ct++;
			}
		}
		System.out.println(ct);
	}
}
