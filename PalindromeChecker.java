import java.util.Scanner;

class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        int left = 0, right = cleanedText.length() - 1;
        
        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is NOT a palindrome.");
        }
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text to check for palindrome: ");
        String inputText = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(inputText);
        checker.displayResult();

        scanner.close();
    }
}
