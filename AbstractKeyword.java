abstract class Car{
    public abstract void carSound();
}
class BMW extends Car{
    public void carSound(){
        System.out.println("brbr........");
    }
}
public class AbstractKeyword{
    public static void main(String arg[]){
        BMW obj=new BMW();
        obj.carSound();
    }
}