
public class CharacterFrequency {
    static int MAX=26;
    public static void main(String arg[]){
        String str="mahesh";
        int n=str.length();
        characterFrequency(str,n);
    }
    public static void characterFrequency(String str,int n) {
        int []freq=new int[MAX];
        for(int i=0;i<n;i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<MAX;i++){
            if(freq[i]==0){
                continue;
            }
            System.out.print((char)(i+'a')+""+freq[i]);
        }
    }
}
