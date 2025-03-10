class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR" + price);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("Mathmetics", "RD Sharma", 199);
        Book book2 = new Book("Richest person of babylon", "Kendrick Lamar", 1250.50);

        // Displaying book details
        book1.displayDetails();
        book2.displayDetails();
    }
}
