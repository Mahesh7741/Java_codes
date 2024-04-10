class Laptop {
    public String model;
    public int price;

    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop that) {
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop lc = new Laptop();
        lc.model = "Asus Tuf Dash";
        lc.price = 83000;
        Laptop lc1 = new Laptop();
        lc1.model = "Asus Tuf Dash";
        lc1.price = 83000;
        boolean result = lc.equals(lc1);
        System.out.println(result);
    }
}
