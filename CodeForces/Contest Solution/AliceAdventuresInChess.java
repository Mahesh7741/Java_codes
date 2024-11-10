import java.util.Scanner;

public class AliceAdventuresInChess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int queenX = sc.nextInt();
            int queenY = sc.nextInt();
            sc.nextLine(); 
            String moves = sc.nextLine();
            int aliceX = 0;
            int aliceY = 0;
            boolean metQueen = false;
            for (int cycle = 0; cycle < 10; cycle++) {  
                for (char move : moves.toCharArray()) {
                    switch (move) {
                        case 'N': aliceY++; break;
                        case 'S': aliceY--; break;
                        case 'E': aliceX++; break;
                        case 'W': aliceX--; break;
                    }
                    if (aliceX == queenX && aliceY == queenY) {
                        System.out.println("YES");
                        metQueen = true;
                        break;
                    }
                }
                if (metQueen) break;
            }
            if (!metQueen) {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
