import java.util.*;
public class ThreePalindrome{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		long n=sc.nextLong();
		Character[] s={'b','b','a','a'};
		long j=0;
		for(long i=0;i<n;i++){
			System.out.print(s[(int)j]);
			j++;
			if(j==4){
				j=0;
			}
		}
		System.out.println();
		sc.close();
	}
}