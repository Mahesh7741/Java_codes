
import java.util.Arrays;

public class SortString {
    public static void main(String arg[]){
        String str="mahesh";
        sortString(str);
    }
    public static void sortString(String str){
        char [] c= str.toCharArray();
        Arrays.sort(c);
        System.out.println(String.valueOf(c));
    }
}
