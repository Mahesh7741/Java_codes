public class URLify {
    public static void repleaceString(String str,String repleaceString){
       str=str.trim();
       str=str.replaceAll("\\s", repleaceString);
       System.out.println(str);
    }
    public static void main(String arg[]){
        String str="Mr John Smith";
        String repleString="%20";
        repleaceString(str,repleString);
    }
}
