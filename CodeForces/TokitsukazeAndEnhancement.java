import java.util.*;

public class TokitsukazeAndEnhancement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       if (n % 4 == 0)
            System.out.println(1 + " " + 'A');
        else if (n % 4 == 1)
            System.out.println(0 + " " + 'A');
        else if (n % 4 == 2)
            System.out.println(1 + " " + 'B');
        else if (n % 4 == 3)
            System.out.println(2 + " " + 'A');
        sc.close();
    }
}
