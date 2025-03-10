class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: INR" + price);
        System.out.println("------------------------");
    }

    // Method to calculate total cost for a given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(101, "Avacado", 800);
        Item item2 = new Item(102, "Chocolate", 499);

        // Displaying item details
        item1.displayDetails();
        item2.displayDetails();

        // Calculating total cost for a given quantity
        int quantity1 = 3; 
        int quantity2 = 5; 

        System.out.println("Total cost for " + quantity1 + " " + item1.itemName + "(s): $" + item1.calculateTotalCost(quantity1));
        System.out.println("Total cost for " + quantity2 + " " + item2.itemName + "(s): $" + item2.calculateTotalCost(quantity2));
    }
}
