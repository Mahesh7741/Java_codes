import java.util.*;
public class NoldbachProblem{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> prime = new ArrayList<>(Arrays.asList(3, 5));
		int count = 2;
		for (int number = 7; number <= n && k != 0; number += 2) {
			int i = 0;
			while (i < count && number % prime.get(i) != 0) {
				++i;
			}
			if (i == count) {
				for (int j = 1; j < count; ++j) {
					if (prime.get(j) + prime.get(j-1) + 1 == number) {
						k -= 1;
						break;
					}
				}
				prime.add(number);
				count++;
			}
		}
		if(k == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
