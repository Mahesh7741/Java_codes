import java.util.*;

public class BusToUdayland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();      
        String[] bus = new String[n];
        boolean possible = false;
        for (int i = 0; i < n; i++) {
            bus[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            if (bus[i].substring(0, 2).equals("OO")) {
                bus[i] = "++" + bus[i].substring(2);
                possible = true;
                break;
            } else if (bus[i].substring(3, 5).equals("OO")) {
                bus[i] = bus[i].substring(0, 3) + "++";
                possible = true;
                break;
            }
        }

        if (possible) {
            System.out.println("YES");
            for (String row : bus) {
                System.out.println(row);
            }
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
