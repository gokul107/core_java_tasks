package Twentyeight_oct;

// Parent class
class Product {

    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }
}

// Child class 1
class Electronics extends Product {

    String warranty;

    Electronics(int id, String name, double price, String warranty) {
        super(id, name, price);
        this.warranty = warranty;
    }

    void display() {
        System.out.println("\n----- ELECTRONICS DETAILS -----");
        displayProduct();
        System.out.println("Warranty: " + warranty);
    }
}

// Child class 2
class Clothing extends Product {

    String size;

    Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    void display() {
        System.out.println("\n----- CLOTHING DETAILS -----");
        displayProduct();
        System.out.println("Dress Size: " + size);
    }
}

// Child class 3
class Food extends Product {

    String expiryDate;

    Food(int id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    void display() {
        System.out.println("\n----- FOOD DETAILS -----");
        displayProduct();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

// Main class
public class Online_shopping_program {

    public static void main(String[] args) {

        Electronics e = new Electronics(
                101, "Laptop", 55000, "2 Years");

        Clothing c = new Clothing(
                102, "T-Shirt", 800, "L");

        Food f = new Food(
                103, "Milk", 60, "20-11-2026");

        e.display();
        c.display();
        f.display();
    }
}