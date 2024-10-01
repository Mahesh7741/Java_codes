import java.util.*;
public class WayTooLongWords{
	public static String abbreviation(String word){
		int len=word.length();
		StringBuilder abbreviation=new StringBuilder();
		Character firstChar=word.charAt(0);
		Character lastChar=word.charAt(len-1);
		abbreviation.append(firstChar);
		abbreviation.append(Integer.toString(len-2));
		abbreviation.append(lastChar);
		return abbreviation.toString();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-- >0){
			String word=sc.nextLine();
			if(word.length()>10){
				String abbreviationWord=abbreviation(word);
				System.out.println(abbreviationWord);
			}
			else{
				System.out.println(word);
			}
		}
	}
}