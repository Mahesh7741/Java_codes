interface Animal{
    default void sound(){
        System.out.println("Sound of the animal");
    }
    static void AnimalInfor(){
        System.out.println("this is Animal Interface");
    }
}

interface Color{
    void color();
}

class Dog implements Animal,Color{
    // public void sound(){
    //     System.out.println("sound of dog...");
    // }

    public void color() {
        System.out.println("black and white");
    }
}



public class Interface{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.color();
        Animal.AnimalInfor();
    }
}