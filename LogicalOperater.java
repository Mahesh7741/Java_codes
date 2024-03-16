public class LogicalOperater {
    public static void main(String arg[]){
        int a=5;
        int b=4;
        int x=10;
        int y=9;
        boolean result1=a>b && x>y;
        System.out.println(result1);
        boolean result2=a>b || x>y;
        System.out.println(result2);
        System.out.println(!result2);
    }
}
