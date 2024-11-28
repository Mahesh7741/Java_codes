import java.util.*;

public class Cinema {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        Map<Integer, Integer> languageCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int language = sc.nextInt();
            languageCount.put(language, languageCount.getOrDefault(language, 0) + 1);
        }

        int m = sc.nextInt();
        int[] audio = new int[m];
        int[] subtitle = new int[m];

        for (int i = 0; i < m; i++) {
            audio[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            subtitle[i] = sc.nextInt();
        }

        int maxVeryPleased = -1;
        int maxAlmostSatisfied = -1;
        int chosenMovie = 0;

        for (int i = 0; i < m; i++) {
            int veryPleased = languageCount.getOrDefault(audio[i], 0);
            int almostSatisfied = languageCount.getOrDefault(subtitle[i], 0);

            if (veryPleased > maxVeryPleased ||
                (veryPleased == maxVeryPleased && almostSatisfied > maxAlmostSatisfied)) {
                maxVeryPleased = veryPleased;
                maxAlmostSatisfied = almostSatisfied;
                chosenMovie = i + 1; 
            }
        }

        System.out.println(chosenMovie);
    }
}
