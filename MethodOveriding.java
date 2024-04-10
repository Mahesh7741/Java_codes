class Clac{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}
class AdvClac extends Clac{
    public int add(int n1, int n2){
        return n1 + n2+1; 
    }
}


public class MethodOveriding {
    public static void main(String arg []){
        AdvClac a = new AdvClac();
        System.out.println(a.add(2, 5));
    } 
}
