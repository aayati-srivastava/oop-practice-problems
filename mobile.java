public class Mobile {
    // Properties
    String brand;
    String model;
    double price;

    // Constructor
    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to show mobile details
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------------");
    }

    // Main method to create objects
    public static void main(String[] args) {
        // Creating objects
        Mobile mobile1 = new Mobile("Samsung", "Galaxy S21", 59999);
        Mobile mobile2 = new Mobile("Apple", "iPhone 13", 72999);
        Mobile mobile3 = new Mobile("OnePlus", "Nord CE 3", 24999);

        // Showing details
        mobile1.showDetails();
        mobile2.showDetails();
        mobile3.showDetails();
    }
}
