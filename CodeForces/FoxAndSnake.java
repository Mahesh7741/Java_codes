import java.util.*;
public class FoxAndSnake{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		StringBuilder str1=new StringBuilder();
		StringBuilder str2=new StringBuilder();
		for(int i=0;i<m;i++){
			str1.append("#");
		}
		for(int i=0;i<m;i++){
			if(i==(m-1)){
				str2.append("#");
			}else{
				str2.append(".");
			}
		}
		StringBuilder str3=new StringBuilder();
		for(int i=0;i<m;i++){
			if(i==(0)){
				str3.append("#");
			}else{
				str3.append(".");
			}
		}
		boolean time=true;
		for(int i=1;i<=n;i++){
			if(i%2==0 && time){
				System.out.println(str2);
				time=false;
			}else if(i%2==0 && time==false){
				System.out.println(str3);
				time=true;
			}
			else{
				System.out.println(str1);
			}
		}
		sc.close();
	}
}