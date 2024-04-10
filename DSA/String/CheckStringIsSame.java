

public class CheckStringIsSame {
    public static void main(String arg[]){
        String str1="Mahesh";
        String str2="Mahesh";
        boolean isSame=checkStringIsSame(str1, str2);
        System.out.println(isSame);
    }
    public static boolean checkStringIsSame(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
