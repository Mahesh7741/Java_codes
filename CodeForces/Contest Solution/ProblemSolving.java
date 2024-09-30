/*import java.util.*;

public class ProblemSolving {
    
    public static void checkProblem(int size, int[] arr) {
        boolean ambiguous = false;
        
        for (int i = 1; i < size - 1; i++) {
            if(!(arr[i-1]<=arr[i])){
				ambiguous=true;
				break;
			}
        }

        if (ambiguous) {
            System.out.println("Ambiguous");
        } else {
            System.out.println(arr[size-2]);  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        
        while (t-- > 0) {
            int size = sc.nextInt();  
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            checkProblem(size, arr);
        }
        
        sc.close();
    }
}
*/

import java.util.Scanner
fun checkProblem(size: Int, arr: IntArray) {
    var am=false
    for (i in 1 until size - 1) {
        if (!(arr[i - 1] <= arr[i])) {
            am = true
            break
        }
    }
if (am) {
        println("Ambiguous")
  } else {
        println(arr[size - 2])
  }
}

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    repeat(t) {
        val size = sc.nextInt()
        val arr = IntArray(size) { sc.nextInt() }
        checkProblem(size, arr)
    }

    sc.close()
}
