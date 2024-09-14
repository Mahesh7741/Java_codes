import java.util.Scanner;
import java.util.HashSet;

public class ValeraHorseShoes {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		HashSet<Integer>colors=new HashSet<>();
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		colors.add(s1);
		colors.add(s2);
		colors.add(s3);
		colors.add(s4);
		int uniqueColor=colors.size();
		int shoesBuy=4-uniqueColor;
		System.out.println(shoesBuy);
		sc.close();
	}
}