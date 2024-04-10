
class Human{
    private String Name;
    private int Age;

    public Human(String Name,int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.Age;
    }
}


public class constuctor {
    public static void main(String arg[]){
        Human h = new Human("Mahesh",20);
        System.out.println(h.getName());
        System.out.println(h.getAge());
    }
}
