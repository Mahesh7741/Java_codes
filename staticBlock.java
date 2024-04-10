
class car{
    String brand;
    int numberOfcars;
    static boolean choice;
    int minPrice;

    static{
        choice=false;
        System.out.println("This is static block");
    }

    public car(){
        brand=" ";
        numberOfcars=1;
        System.out.println("This is constucter block");
    }
    public void show(){
        System.out.println((brand)+" : "+numberOfcars+" : "+minPrice+" : "+choice);
    }
}



public class staticBlock {
    public static void main(String arg[]){
        car c1=new car();
        c1.brand="BMW";
        c1.numberOfcars=1;
        c1.minPrice=15000000;
        car.choice=false;
        
        car c2=new car();
        c2.brand="supara";
        c2.numberOfcars=2;
        c2.minPrice=25000000;
        car.choice=true;

        c1.show();
        c2.show();
    }
}
