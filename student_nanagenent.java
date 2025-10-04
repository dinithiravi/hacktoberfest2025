class Student {
    // Private fields (Encapsulation)
    private String name;
    private int age;
    private double marks;

    // Constructor
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------");
    }

    // Method to check pass or fail
    public void checkResult() {
        if (marks >= 50) {
            System.out.println(name + " has passed ✅");
        } else {
            System.out.println(name + " has failed ❌");
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Dinithi", 22, 75.5);
        Student s2 = new Student("Kavindu", 21, 45.0);

        // Display student details
        s1.displayDetails();
        s2.displayDetails();

        // Check results
        s1.checkResult();
        s2.checkResult();
    }
}
