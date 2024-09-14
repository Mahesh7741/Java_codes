import java.util.Scanner;
import java.util.HashSet;
public class BoyOrGirl{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		HashSet<Character>hs=new HashSet<>();
		String userId=sc.nextLine();
		for(char ch:userId.toCharArray()){
			hs.add(ch);
		}
		int totalDistinctChar=hs.size();
		int numberOfChar=totalDistinctChar%2;
		if(numberOfChar==0){
			System.out.println("CHAT WITH HER!");
		}
		else{
			System.out.println("IGNORE HIM!");
		}
		sc.close();
	}
}