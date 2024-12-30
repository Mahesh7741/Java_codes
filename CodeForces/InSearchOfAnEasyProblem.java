import java.util.*;

public class InSearchOfAnEasyProblem{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean ans=false;
		while(n-- >0){
			int a=sc.nextInt();
			if(a==1){
				ans=true;
				break;
			}
		}
		if(ans){
			System.out.println("HARD");
		}else{
			System.out.println("EASY");
		}
		sc.close();
	}
}