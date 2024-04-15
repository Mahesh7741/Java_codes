public class PrintPossibleStringUsingPleacing {
    public static void main(String arg[]){
        String str="ABC";
        printPossibleStringUsingPleacing(str);
    }
    public static void printPossibleStringUsingPleacing(String str){
        int lenstr = str.length();
        for(int i=0;i<=(Math.pow(lenstr-1,2));i++){
            String code=generateBinary(i);
            if(code.length()!=lenstr){
                code=lengthChangeString(code,n);
            }
            System.out.println(code+" ");
        }
    }
    public static String generateBinary(int n){
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.insert(0, n%2);
            n /= 2;
        }
        return sb.toString();
    }
    
}
