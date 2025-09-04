public class Student {
    // Attributes
    int rollNo;
    String name;
    double marks;

    // Constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student(101, "Rahul Verma", 85.5);
        Student student2 = new Student(102, "Anjali Singh", 91.0);

        // Displaying student details
        student1.display();
        student2.display();
    }
}
