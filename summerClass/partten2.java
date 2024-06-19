package summerClass;

public class partten2 {
    public static void main(String[] args) {
        int v = 3;
        for (int i = v; i > 0; i--) {
            int eq = (4 * i) + 4;
            
            for (int j = eq; j >= 0; j--) {
                if ((eq / 2) == j) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.err.println();
            System.out.print("  ");
            
        }
        System.out.print("  **A**  ");
        System.err.println();
        
        for (int i = 1; i <= v; i++) {
            System.out.print("  ");
            int eq = (4 * i) + 4;
            for (int j = eq; j >= 0; j--) {
                if ((eq / 2) == j) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            
            System.err.println();
            
        }
    }
}
