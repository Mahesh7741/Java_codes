import java.util.*;

public class JustifyWords {
    static int maxWords = 0, K, N, M;
    static List<String> words = new ArrayList<>();

    static void tryPlacingWords(int index, int[] lines, int count, List<String> validWords) {
        if (index == validWords.size()) {
            maxWords = Math.max(maxWords, count);
            return;
        }
        if (count + validWords.size() - index <= maxWords) return;

        for (int j = 0; j < N; j++) {
            if (lines[j] == 0) {
                lines[j] = validWords.get(index).length();
                tryPlacingWords(index + 1, lines, count + 1, validWords);
                lines[j] = 0;
                break;
            } else if (lines[j] + 1 + validWords.get(index).length() <= M) {
                lines[j] += 1 + validWords.get(index).length();
                tryPlacingWords(index + 1, lines, count + 1, validWords);
                lines[j] -= 1 + validWords.get(index).length();
            }
        }
        tryPlacingWords(index + 1, lines, count, validWords);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        for (int i = 0; i < K; i++) words.add(sc.next());
        N = sc.nextInt();
        M = sc.nextInt();

        List<String> validWords = new ArrayList<>();
        for (String word : words) if (word.length() <= M) validWords.add(word);
        validWords.sort((a, b) -> a.length() != b.length() ? Integer.compare(b.length(), a.length()) : a.compareTo(b));

        tryPlacingWords(0, new int[N], 0, validWords);
        System.out.print(maxWords);
        sc.close();
    }
}
