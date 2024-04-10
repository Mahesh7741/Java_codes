
class Mobile{
    String phone;
    int price;
    static String LocalName;

    void show(){
        System.out.println(phone + " :  " + price + " :  " + LocalName);
    }
}


public class staticKeyword {
    public static void main(String arg[]){
        Mobile obj1 = new Mobile();
        obj1.phone = "IPhone";
        obj1.price = 150000;
        Mobile.LocalName = "phone";
        
        Mobile obj2 = new Mobile();
        obj2.phone = "Samsung";
        obj2.price = 80000;
        Mobile.LocalName = "Smartphone";

        Mobile.LocalName="Mahesh";
        obj1.show();
        obj2.show();
    }
}
