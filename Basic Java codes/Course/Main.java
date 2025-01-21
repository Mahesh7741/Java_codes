
abstract class Animal{
    private String name="shubham";
    Animal(){
        System.out.println("Animal constructor");
    }

    abstract public void sound();
    public void sleep(){
        System.out.println("SLEEP ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    public void Animal(){
        System.out.println("override Animal constructor into dog class..." +getName());
    }
    public void sleep(){
        System.out.println("Dog is sleeping ...");
    }
    public void sound(){
        System.out.println("buuu..");
    }
}

public class Main{
    public static void main(String[] args){
        
        Dog obj=new Dog();
        obj.Animal();
        obj.sleep();
        obj.sound();
    }
}