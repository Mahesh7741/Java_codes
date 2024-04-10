package DSA.String;

public class BinaryRepresentationOfNextNumber {
    // public static void main(String arg[]){
    //     String str="10011";
    //     int num=Integer.parseInt(str,2);
    //     num++;
    //     str=Integer.toBinaryString(num);
    //     System.out.println(str);
    // }
        

    //  two method 

    
    public static void main(String arg[]){
        String str="10011";
        System.out.println(getNextBinaryRepresentation(str));
    }
    public static String getNextBinaryRepresentation(String str){
        int num=getDecimal(str);
        num++;
        str=getBinaryString(num);
        return str;
    }
    public static int getDecimal(String str){
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                count+=(int)(Math.pow(2, str.length()-1-i));
            }
        }
        return count;
    }
    public static String getBinaryString(int num){
        if (num == 0) {
            return "0"; 
        }
        StringBuilder newStr = new StringBuilder(); 
        while (num != 0) {
            newStr.insert(0, num % 2);
            num /= 2;
        }
        return newStr.toString();
    }
}
