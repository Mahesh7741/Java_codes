class A{
    public A(){
        System.out.println("in class A");
    }
    public A(int n){
        this();
        System.out.println("in class A int " + n);
    }
}
class B extends A{
    public B(){
        super(2);
        System.out.println("in class B");
    }
    public B(int n){
        this();
        System.out.println("in class B int " + n);
    }
}



public class thisMethod {
    public static void main(String arg[]){
        B b = new B(5);
    }
}
