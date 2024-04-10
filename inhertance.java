class Cals{
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}
class AdvCals extends Cals {
    public int mult(int n1, int n2) {
        return n1*n2;
    }
    public int div(int n1, int n2) {
        return n1/n2;
    }
}


public class inhertance {
    public static void main(String arg[]){
        AdvCals a = new AdvCals();
        System.out.println(a.add(2, 5));
        System.out.println(a.sub(5, 2));
        System.out.println(a.mult(2, 5));
        System.out.println(a.div(10,2));
    }
}
