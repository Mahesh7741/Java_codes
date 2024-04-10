

public class ReverseString {
    // public static void main(String arg[]) {
    //     String str = "Mahesh";
    //     String result = reverseString(str);
    //     System.out.println(result);
    // }

    // public static String reverseString(String str){
    //     StringBuilder sb=new StringBuilder();
    //     for(int i=str.length()-1; i>=0; i--){
    //         sb.append(str.charAt(i));
    //     }
    //     return sb.toString();
    // }

    public static void main(String arg[]){
        String str="Mahesh";
        String newStr="";
        for(int i=str.length()-1; i>=0; i--){
            newStr+=str.charAt(i);
        }
        System.out.println(newStr);
    }
}

