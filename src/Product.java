public class Product {

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    private String name;

    private double price;

    private int quantity;

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString() {
       return "Name: " + name + "Price: " + price + "Quantity " + quantity;
    }
}
