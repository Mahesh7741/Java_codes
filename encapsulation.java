class Human{
    private String name;
    private int age;

    public void setAge(int a) {
        age=a;
    }
    public void setname(String n) {
        name=n;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String arg[]){
        Human h=new Human();
        h.setname("Mahesh");
        h.setAge(20);
        System.out.println(h.getName()+" "+h.getAge()+" ");
    }
}
