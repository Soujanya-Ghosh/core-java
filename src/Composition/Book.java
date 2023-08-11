package Composition;

public class Book {
    private String name;
    private String authorName;
    private double price;
    private int quantity;

    public Book(String name, String authorName, double price, int quantity) {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName(String name) {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName+ '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
