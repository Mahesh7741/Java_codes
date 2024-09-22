import java.util.Scanner;
public class AmusingJoke{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String hostName=sc.nextLine();
		String guestName=sc.nextLine();
		String pileName=sc.nextLine();
		int[] alphabets=new int[26];
		if(hostName.length()+guestName.length() !=pileName.length()){
			System.out.println("NO");
			return ;
		}
		for(char ch:hostName.toCharArray()){
			alphabets[ch-'A']++;
		}
		for(char ch:guestName.toCharArray()){
			alphabets[ch-'A']++;
		}
		for(char ch:pileName.toCharArray()){
			alphabets[ch-'A']--;
		}
		boolean checkAlp=true;
		for(int i=0;i<26;i++){
			if(alphabets[i]==0){
				continue;
			}
			else{
				checkAlp=false;
				break;
			}
			
		}
		if(checkAlp){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		sc.close();
	}
}