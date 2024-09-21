import java.util.Scanner;

public class PetyaLuckyTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        String ticket = sc.next(); 
        for (int i = 0; i < n; i++) {
            char ch = ticket.charAt(i);
            if (ch != '4' && ch != '7') {
                System.out.println("NO");
                return;
            }
        }

        int mid = n / 2;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < mid; i++) {
            firstHalfSum += Character.getNumericValue(ticket.charAt(i));
        }
        for (int i = mid; i < n; i++) {
            secondHalfSum += Character.getNumericValue(ticket.charAt(i));
        }
        if (firstHalfSum == secondHalfSum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
