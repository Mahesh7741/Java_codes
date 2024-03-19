class calulator{
    public int add(int num1, int num2){
        System.out.println("in addition");
        return num1 + num2;
    }
}

public class createObject {
    public static void main (String arg[]){
        calulator cal=new calulator();
        System.out.println(cal.add(4,5));
    }
}
