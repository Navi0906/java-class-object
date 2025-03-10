class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all details of the mobile phone
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: INR" + price);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        // Creating MobilePhone objects with sample data
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 99900);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 84900);

        // Displaying details of each mobile phone
        phone1.displayDetails();
        phone2.displayDetails();
    }
}
