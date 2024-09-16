import java.util.Scanner;
public class I_Love_MAHESH{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] points=new int[n];
		for(int i=0;i<n;i++){
			points[i]=sc.nextInt();
		}
		int minPoints=points[0];
		int maxPoints=points[0];
		int count=0;
		for(int contest:points){
			if(contest<minPoints){
				count++;
				minPoints=contest;
			}
			else if(contest>maxPoints){
				count++;
				maxPoints=contest;
			}
		}
		System.out.println(count);
	}
}