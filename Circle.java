class Circle {
    // Attribute
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Creating Circle objects
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        // Displaying details
        circle1.displayDetails();
        circle2.displayDetails();
    }
}
