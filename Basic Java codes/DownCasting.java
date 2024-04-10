class Animal{
    public void speak(){
        System.out.println("Amimal Sound");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Woof");
    }
}



public class DownCasting {
    public static void main(String arg[]){
        // Dog dog = new Dog();
        // dog.bark();
        // dog.speak();
        Animal animal = new Dog();
        // animal.bark();
        Dog dog = (Dog) animal;
        dog.bark();
    }
}
