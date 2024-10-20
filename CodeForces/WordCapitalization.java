import java.util.*;
public class WordCapitalization{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String f=s.substring(0,1).toUpperCase();
		System.out.println(f+s.substring(1,s.length()));
		sc.close();
	}
}