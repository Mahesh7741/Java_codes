import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class BearAndReverseRadewoosh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c;
        int times1 = 0, times2 = 0;

        n = sc.nextInt();
        c = sc.nextInt();

        int[] score = new int[n];
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }

        int limak = 0, radewoosh = 0;
        
        // To find Limak's scores
        for (int i = 0; i < n; i++) {
            times1 += time[i];
            limak += Math.max(0, score[i] - c * times1);
        }
        Integer[] scoreDesc = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Integer[] timeDesc = Arrays.stream(time).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreDesc, Collections.reverseOrder());
        Arrays.sort(timeDesc, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            times2 += timeDesc[i];
            radewoosh += Math.max(0, scoreDesc[i] - c * times2);
        }

        if (limak > radewoosh) {
            System.out.println("Limak");
        } else if (limak < radewoosh) {
            System.out.println("Radewoosh");
        } else {
            System.out.println("Tie");
        }

        sc.close();
    }
}
