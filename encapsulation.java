class Human{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}

public class encapsulation {
    public static void main(String arg[]){
        Human h=new Human();
        h.setName("Mahesh");
        h.setAge(20);
        System.out.println(h.getName()+" "+h.getAge()+" ");
    }
}
