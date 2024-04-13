public class CamelCaseOfsentence {
    public static void main(String arg[]){
        String str="i am mahesh";
        camelCaseOfsentence(str);
    }
    public static void camelCaseOfsentence(String str){
        String[] words=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word : words){
            if(word.charAt(0)-'a'<0){
                sb.append(word);
            }
            else{
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            }
        }
        System.out.println(sb.toString());
    }

}
