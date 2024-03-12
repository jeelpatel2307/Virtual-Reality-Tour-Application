import java.util.Scanner;

public class VirtualRealityTour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to Virtual Reality Tour Application");

        // Display menu options
        System.out.println("Menu:");
        System.out.println("1. Explore City");
        System.out.println("2. Explore Nature");
        System.out.println("3. Exit");

        // Prompt user to select an option
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Process user's choice
        switch (choice) {
            case 1:
                exploreCity();
                break;
            case 2:
                exploreNature();
                break;
            case 3:
                System.out.println("Exiting Virtual Reality Tour Application. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        scanner.close();
    }

    // Method to explore city in virtual reality
    private static void exploreCity() {
        System.out.println("Exploring City in Virtual Reality...");
        // Add code to simulate virtual reality city tour
    }

    // Method to explore nature in virtual reality
    private static void exploreNature() {
        System.out.println("Exploring Nature in Virtual Reality...");
        // Add code to simulate virtual reality nature tour
    }
}
