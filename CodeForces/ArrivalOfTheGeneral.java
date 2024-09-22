import java.util.Scanner;
public class ArrivalOfTheGeneral{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] heights=new int[n];
		for(int i=0;i<n;i++){
			heights[i]=sc.nextInt();
		}
		 int maxIndex = 0; 
        int minIndex = 0; 
        
        for (int i = 0; i < n; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
            if (heights[i] <= heights[minIndex]) {
                minIndex = i;
            }
        }
        
        int moves = maxIndex;
        if (minIndex > maxIndex) {
            moves += (n - 1 - minIndex);
        } else {
            moves += (n - 1 - minIndex - 1);
        }
        System.out.println(moves);
        
        sc.close();
	}
}