import java.util.*;

public class Combination {
    static Scanner sc = new Scanner(System.in);

    static class Card {
        int a;
        int b;

        public Card(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        Card[] cards = new Card[n];

        for (int i = 0; i < n; i++) {
            cards[i] = new Card(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(cards, (card1, card2) -> {
            if (card1.b != card2.b) {
                return card2.b - card1.b;
            }
            return card2.a - card1.a;
        });

        int points = cards[0].a;
        int totalCards = cards[0].b;

        for (int i = 1; i < n && i <= totalCards; i++) {
            points += cards[i].a;
            totalCards += cards[i].b;
        }

        System.out.println(points);
    }
}
