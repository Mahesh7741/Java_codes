public class stringBuffer {
    public static void main(String arg[]){
        StringBuffer sb=new StringBuffer("Mahesh");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        for(char s:sb.toString().toCharArray()){
            System.out.print(s+" ");
        }
        System.out.println("");
        // System.out.println(sb.append(" Savant"));
        System.out.println(sb.insert(6 , " Savant"));
        System.out.println(sb.capacity());
        // System.out.println(sb.length());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
    }
}
