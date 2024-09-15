import java.util.Scanner;

public class SeriesOfCrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); 
        int[] row = new int[3];
        int[] col = new int[3];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                if (line.charAt(j) == '*') {
                    row[count] = i + 1; 
                    col[count] = j + 1; 
                    count++;
                }
            }
        }

        int fourthRow = (row[0] == row[1]) ? row[2] : (row[0] == row[2]) ? row[1] : row[0];
        int fourthCol = (col[0] == col[1]) ? col[2] : (col[0] == col[2]) ? col[1] : col[0];
        System.out.println(fourthRow + " " + fourthCol);
        
        sc.close();
    }
}
