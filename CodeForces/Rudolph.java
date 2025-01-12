import java.util.Scanner;

public class Rudolph {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        sc.nextLine();  

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static boolean getWinner(String[] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == symbol && board[i].charAt(1) == symbol && board[i].charAt(2) == symbol)
                return true;
            if (board[0].charAt(i) == symbol && board[1].charAt(i) == symbol && board[2].charAt(i) == symbol)
                return true;
        }
        if (board[0].charAt(0) == symbol && board[1].charAt(1) == symbol && board[2].charAt(2) == symbol)
            return true;
        else if (board[0].charAt(2) == symbol && board[1].charAt(1) == symbol && board[2].charAt(0) == symbol)
            return true;

        return false;
    }

    public static void solve(Scanner sc) {
        String[] board = new String[3];
        for (int i = 0; i < 3; i++) {
            board[i] = sc.nextLine();
        }

        if (getWinner(board, 'X')) {
            System.out.println("X");
        } else if (getWinner(board, 'O')) {
            System.out.println("O");
        } else if (getWinner(board, '+')) {
            System.out.println("+");
        } else {
            System.out.println("DRAW");
        }
    }
}
