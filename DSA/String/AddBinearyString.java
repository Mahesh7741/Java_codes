public class AddBinearyString {
    public static void main(String arg[]){
        String [] bineary={"1", "10", "11"};
        String result= addNString(bineary);
        System.out.println(result);
    }
    public static String addNString(String[] binary){
        int maxlen=0;
        for(String str:binary){
            maxlen=Math.max(maxlen,str.length());
        }
        for (int i = 0; i < binary.length; i++) {
            binary[i] = padWithZeros(binary[i], maxlen);
        }
        int add=0;
        for(int i=0; i<binary.length; i++){
            add +=convertIntegar(binary[i]);
        }
        String resultString=Integer.toBinaryString(add);
        return resultString;
    }
    public static int convertIntegar(String str){
        int cnt=0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)=='1'){
                cnt+=(int)Math.pow(2, i);
            }
        }
        return cnt;
    }
    public static String padWithZeros(String str, int length) {
        StringBuilder paddedStr = new StringBuilder();
        int numZeros = length - str.length();
        for (int i = 0; i < numZeros; i++) {
            paddedStr.append('0');
        }
        paddedStr.append(str);
        return paddedStr.toString();
    }
}
