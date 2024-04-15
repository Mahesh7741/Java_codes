public class KThNonRnepeatingCharacter {
    public static void main(String arg[]){
        String str="geeksforgeeks";
        int k=4;
        char result=nKThNonRnepeatingCharacter(str, k);
        if(result !='\0'){
            System.out.println(result);
        }
        else{
            System.out.println("Less than k non-repeating characters in input.");
        }
    }
    public static char nKThNonRnepeatingCharacter(String str,int k) {
        char [] storageChar=new char[26];
        int cnt=0;
        for(char ch :str.toCharArray()){
            storageChar[ch-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(storageChar[str.charAt(i)-'a']==1){
                cnt++;
            }
            if(cnt==k){
                return str.charAt(i);
            }
        }
        return '\0';
    }
}
