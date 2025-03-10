import java.util.Scanner;

class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate total price of the item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalPrice());
    }
}

// Shopping Cart Class
class ShoppingCart {
    private CartItem[] cart; 
    private int itemCount; 
    private static final int MAX_ITEMS = 10; 

    // Constructor
    public ShoppingCart() {
        cart = new CartItem[MAX_ITEMS];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount >= MAX_ITEMS) {
            System.out.println("Cart is full! Cannot add more items.");
            return;
        }
        cart[itemCount] = new CartItem(itemName, price, quantity);
        itemCount++;
        System.out.println(quantity + " x " + itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].getItemName().equalsIgnoreCase(itemName)) {
                found = true;
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null;
                itemCount--;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in the cart.");
        }
    }

    // Method to display the cart contents
    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("\nShopping Cart:");
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            cart[i].displayItem();
            totalCost += cart[i].getTotalPrice();
        }
        System.out.println("Total Cost: INR" + totalCost);
        System.out.println("------------------------------");
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Welcome to the Shopping Cart System!");

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter Item Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeItem = scanner.nextLine();
                    cart.removeItem(removeItem);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
