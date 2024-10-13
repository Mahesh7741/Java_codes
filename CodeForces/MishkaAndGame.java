import java.util.*;
public class MishkaAndGame{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mishkaWin=0;
		int chrisWin=0;
		sc.nextLine();
		for(int i=0;i<n;i++){
			int mishka=sc.nextInt();
			int chris=sc.nextInt();
			if(mishka>chris){
				mishkaWin++;
			}else if(mishka==chris){
				mishkaWin++;
				chrisWin++;
			}else{
				chrisWin++;
			}
		}
		if(mishkaWin>chrisWin){
			System.out.println("Mishka");
		}else if(mishkaWin==chrisWin){
			System.out.println("Friendship is magic!^^");
		}else{
			System.out.println("Chris");
		}
		sc.close();
	}
}