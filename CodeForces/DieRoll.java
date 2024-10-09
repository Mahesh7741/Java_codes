import java.util.*;
public class DieRoll{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		int w=sc.nextInt();
		String[] probability = {"", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
		int d=Math.max(y,w);
		System.out.println(probability[d]);
		sc.close();
	}
}