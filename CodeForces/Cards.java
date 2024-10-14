import java.util.*;

public class Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        List<int[]> indexedCards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
            indexedCards.add(new int[]{cards[i], i + 1});
        }
        indexedCards.sort(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < n / 2; i++) {
            int[] first = indexedCards.get(i);
            int[] second = indexedCards.get(n - 1 - i);
            System.out.println(first[1] + " " + second[1]);
        }
        
        sc.close();
    }
}
