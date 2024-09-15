import java.util.HashSet;
import java.util.Scanner;
public class Hashset{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<Integer>[] days=new HashSet[n];
		for(int i=0;i<n;i++) days[i]=new HashSet<>();
		
		for(int i=0;i<n;i++){
			int numbersInHashset=sc.nextInt();
			for(int j=0;j<numbersInHashset;j++){
				int number=sc.nextInt();
				days[i].add(number);
			}
		}
		System.out.println("\nHashSets:");
        for (int i = 0; i < n; i++) {
            System.out.println("HashSet at index " + i + ": " + days[i]);
        }
		sc.close();
	}
}