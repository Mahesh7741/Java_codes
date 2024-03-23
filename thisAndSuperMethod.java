class A{
    public A(){
        System.out.println("in Class A");
    }
    public A(int n){
        System.out.println("in Class A int "+n);
    }
}
class B extends A{
    public B(){
        super(2); 
        System.out.println("in Class B");
    }
    public B(int n){   
        super(n);     
        System.out.println("in Class B int "+n);
    }
}

public class thisAndSuperMethod {
    public static void main(String arg[]){
        B b = new B();
    }
}
