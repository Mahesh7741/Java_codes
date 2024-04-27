
public class QueriesRepeatedString {
    public static void queriesRepeatedString(String str,int i,int j){
        int lenStr=str.length();
        i %= lenStr;
        j %= lenStr;
        if(str.charAt(i)==str.charAt(j)){
            System.out.println("Yes");        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String arg[]){
        String str="geeksforgeeks";
        queriesRepeatedString(str, 0, 8);
        queriesRepeatedString(str, 8, 13);
        queriesRepeatedString(str, 6, 15);
    }
}