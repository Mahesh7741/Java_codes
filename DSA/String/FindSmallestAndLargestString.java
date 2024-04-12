public class FindSmallestAndLargestString {
    public static void main(String arg[]){
        String str="This is a test string";
        findSmallestAndLargestString(str);
    }
    public static void findSmallestAndLargestString(String str){
       String []words=str.split(" ");
       int smallLength=Integer.MAX_VALUE;
       int largestLength=Integer.MIN_VALUE;
       for(String word : words){
        if(smallLength>word.length()){
            smallLength=word.length();
        }
        if(largestLength<word.length()){
            largestLength=word.length();
        }
       }
       System.out.println(smallLength);
       System.out.println(largestLength);
    }
}
