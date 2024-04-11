public class GenerateAllBinearyStringUsingPattern {
    public static void main(String arg[]){
        String str="1??0?101";
        generateString(str);
    }
    public static void generateString(String str){
        int []storeLocation= new int[str.length()+1];
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='?'){
                storeLocation[count]=i;
                count++;
            }
        }
        for (int i = 0; i < Math.pow(2, count); i++) {
            String bstr = Integer.toBinaryString(i);
            if (bstr.length() < count) {
                int diff = count - bstr.length();
                for (int j = 0; j < diff; j++) {
                    bstr = "0" + bstr;
                }
            }
            StringBuilder sb = new StringBuilder(str);
            for (int k = 0; k < count; k++) {
                sb.setCharAt(storeLocation[k], bstr.charAt(k));
            }
            System.out.println(sb.toString());            
        }
        
    }
}