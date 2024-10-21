import java.util.*;
public class SeaBattle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int w1=sc.nextInt();
		int h1=sc.nextInt();
		int w2=sc.nextInt();
		int h2=sc.nextInt();
		System.out.println(((w1+h1+h2)*2)+4);
		sc.close();
	}
}