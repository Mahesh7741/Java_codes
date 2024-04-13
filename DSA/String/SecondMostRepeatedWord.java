import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedWord {
    public static void main(String arg[]){
        String [] words={"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        String word=secondMostRepeatedWord(words);
        System.out.println(word);
    }
    public static String secondMostRepeatedWord(String[] words) {
        int n=words.length;
        HashMap<String,Integer> hm= new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(words[i])){
                hm.put(words[i], hm.get(words[i])+1);
            }
            else{
                hm.put(words[i], 1);
            }
        }
        int max=Collections.max(hm.values());
        ArrayList<Integer>a=new ArrayList<Integer>();
        for(HashMap.Entry<String,Integer>j:hm.entrySet()){
            if(j.getValue() !=max){
                a.add(j.getValue());
            }
        }
        Collections.sort(a);
        for(HashMap.Entry<String,Integer>x:hm.entrySet()){
            if(x.getValue()==a.get(a.size()-1)){
                return x.getKey();
            }
        }   
        return "-1";
    }
}