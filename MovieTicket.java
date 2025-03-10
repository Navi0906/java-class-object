import java.util.HashSet;
import java.util.Scanner;

class MovieTicket {
    // Attributes
    private String movieName;
    private int seatNumber;
    private double price;
    private static HashSet<Integer> bookedSeats = new HashSet<>(); 

    // Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket
    public static MovieTicket bookTicket(String movieName, int seatNumber, double price) {
        if (bookedSeats.contains(seatNumber)) {
            System.out.println("Seat " + seatNumber + " is already booked. Please choose another seat.");
            return null;
        } else {
            bookedSeats.add(seatNumber);
            System.out.println("Ticket booked successfully!");
            return new MovieTicket(movieName, seatNumber, price);
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        System.out.println("\nMovie Ticket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: INR" + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Movie Ticket Booking System!");

        while (true) {
            System.out.println("\n1. Book a Ticket");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Movie Name: ");
                String movie = scanner.nextLine();
                System.out.print("Enter Seat Number: ");
                int seat = scanner.nextInt();
                System.out.print("Enter Ticket Price: ");
                double price = scanner.nextDouble();

                MovieTicket ticket = bookTicket(movie, seat, price);
                if (ticket != null) {
                    ticket.displayTicket();
                }
            } else if (choice == 2) {
                System.out.println("Thank you for using the Movie Ticket Booking System!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
