public class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
        System.out.println("------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("Aayati Srivastava", 101, 50000.0);
        Employee emp2 = new Employee("Riddhima Sahu", 102, 62000.0);

        // Displaying details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
