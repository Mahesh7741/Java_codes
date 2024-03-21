
class person {
    static String name;
    int height;
    boolean disabled;
    void show1() {
        System.out.println(name + "   " + height + "  " + disabled);
    }

    public static void show(person obj) {
        System.out.println(name + "   " + obj.height + "  " + obj.disabled);
    }
}

public class staticMethod {
    public static void main(String arg[]) {
        person s = new person();
        person.name = "Mahesh";
        s.disabled = false;
        s.height = 170;
        s.show1();
        person.show(s);
    }
}
