public class CountNumberOfEqualPairs {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int count=countNumberOfEqualPairs(str);
        System.out.println(count);
    }
    // public static int countNumberOfEqualPairs(String str){
    //     int cnt=0;
    //     for(int i=0;i<str.length();i++){
    //         for(int j=0;j<str.length();j++){
    //             if(str.charAt(i)==str.charAt(j)){
    //                 System.out.println("("+str.charAt(i)+","+str.charAt(j)+")");
    //                 cnt++;
    //             }
    //         }
    //     }
    //     return cnt;
    // }
    // Method 2:
    public static int countNumberOfEqualPairs(String str){
        int cnt=0;
        int []heap = new int[26];
        for(int i=0;i<str.length();i++){
            heap[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            cnt+=(int)Math.pow(heap[i],2);
        }
        return cnt ;
    }
}


