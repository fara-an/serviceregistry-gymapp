public class Product {
    String name;
    String type;
    double price;

    Product(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}
