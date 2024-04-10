package DSA.String;

import java.util.HashSet;

public class CountDistinctSubstring {
    public static void main(String arg[]){
        String str="Mahesh";
        int size=str.length();
        HashSet<String>hs=new HashSet<String>();
        int cnt=countDistinctSubstring(str,size,hs);
        System.out.println(cnt);
    }
    public static int countDistinctSubstring(String str,int size,HashSet<String>hs) {
        String s="";
        for(int i=0;i<size;i++){
            s="";
            for(int j=i;j<size;j++){
                s+=str.charAt(j);
                hs.add(s);
            }
        }
        return hs.size()+1;
    }
}
