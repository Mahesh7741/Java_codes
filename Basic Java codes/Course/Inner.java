class OuterClass{

    static String content="OuterClass Content";
    int number=10; //cannot be accessed directly in side in Inner class            
    public void insideOuterClassMethod(){
        class MethodInnerClass{
            void insideOfMethodInnerClassMethod(){
                System.out.println("insideOfMethodInnerClassMethod");
            }
        }
        MethodInnerClass obj=new MethodInnerClass();
        obj.insideOfMethodInnerClassMethod();
    }
    // static class OuterInnerClass{
    //     public void println(){
    //         System.out.println(content + " " );
    //     }
    // }


}



public class Inner {
    public static void main(String[] args) {
        
        // OuterClass obj=new OuterClass();
        // obj.insideOuterClass();
        // OuterClass.OuterInnerClass inner=new OuterClass.OuterInnerClass();

        // inner.println();

        OuterClass obj=new OuterClass();
        obj.insideOuterClassMethod();
    }
}
