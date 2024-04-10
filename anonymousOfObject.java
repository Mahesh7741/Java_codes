class A{
    public A() {
        System.out.println("Hii");
    }
    public void show() {
        System.out.println("Hii, i am mahesh");
    }
}

public class anonymousOfObject {
    public static void main(String arg[]){
        new A().show();
    }
}
