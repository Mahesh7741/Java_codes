class calulator {
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, int num2) {
        return num1 + num2;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        calulator cal = new calulator();
        System.out.println(cal.add(5, 2, 5)); // output 12
        System.out.println(cal.add(5, 5)); // output 10
        System.out.println(cal.add(2.23, 55)); // output 57.23
    }
}
