class Human{
    private String Name;
    private int Age;
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public int getAge(){
        return this.Age;
    }
}

public class thisKeyword {
    public static void main(String arg[]){
        Human h = new Human();
        h.setName("Mahesh");
        System.out.println(h.getName());
        h.setAge(20);
        System.out.println(h.getAge());
    }
}
