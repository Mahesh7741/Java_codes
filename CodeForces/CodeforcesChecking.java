import java.util.*;
public class CodeforcesChecking{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        String target = "codeforces";
        long t = sc.nextLong();
        while(t-- >0){
            String s = sc.next();
            System.out.println((target.contains(s)) ? "YES" : "NO");
        }
    }
}
