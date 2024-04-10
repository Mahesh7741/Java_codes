
public class SwapCharacters{
    public static void main(String arg[]){
        String str="ABCDEFGH";
        int B=4;
        int C=3;
        String s= swapCharacters(str,B,C);
        System.out.println(s);
    }
    public static String swapCharacters(String str,int B,int C){
        int n=str.length();
        C=C%n;
        char []arr=str.toCharArray();
        for(int i=0;i<B;i++){
            char temp=arr[i];
            arr[i]=arr[(i+C)%n];
            arr[i]=arr[(i+C)%n]=temp;
        }
        return new String(arr);
    }
}