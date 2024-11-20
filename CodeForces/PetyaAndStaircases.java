import java.util.*;

public class PetyaAndStaircases {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int noOfSteps = sc.nextInt();
        int noOfDirtySteps = sc.nextInt();

        if (noOfDirtySteps == 0) {
            System.out.println("YES");
            return;
        }

        int[] dirtySteps = new int[noOfDirtySteps];
        for (int i = 0; i < noOfDirtySteps; i++) {
            dirtySteps[i] = sc.nextInt();
        }

        Arrays.sort(dirtySteps);

        boolean isPossible = true;

        if (dirtySteps[0] == 1 || dirtySteps[noOfDirtySteps - 1] == noOfSteps) {
            isPossible = false;
        } else {
            for (int i = 2; i < noOfDirtySteps; i++) {
                if (dirtySteps[i] == dirtySteps[i - 1] + 1 && dirtySteps[i] == dirtySteps[i - 2] + 2) {
                    isPossible = false;
                    break;
                }
            }
        }

        System.out.println(isPossible ? "YES" : "NO");
    }
}
