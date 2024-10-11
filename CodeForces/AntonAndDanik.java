import java.util.*;
public class AntonAndDanik{
	public static void howWin(int n,String s){
		int A_Count=0;
		int D_Count=0;
		for(char c:s.toCharArray()){
			if(c=='A') A_Count++;
			else if(c=='D') D_Count++;
		}
		if(A_Count>D_Count){
			System.out.println("Anton");
		} else if(A_Count<D_Count){
			System.out.println("Danik");
		}else{
			System.out.println("Friendship");
		}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		howWin(n,s);
		sc.close();
	}
}