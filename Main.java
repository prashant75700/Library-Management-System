import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner sc = new Scanner(System.in);
        boolean running  = true;

        System.out.println("=== WELCOME TO THE CODING PARTNER LIBRARY ===");

        while (running) {
            System.out.println("\n~~~ MENU INFO ~~~");
            System.out.println("1. Add ");
            System.out.println("2. Checkout ");
            System.out.println("3. Return Book (With ISBN no.) ");
            System.out.println("4. Find Book ( With ISBN no.");
            System.out.println("5. Stats ");
            System.out.println("6. Exit ");

            System.out.print("Select an Option: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    myLibrary.addBook(isbn, title);
                    break;

                case "2": {
                    System.out.print("Enter ISBN to checkout: ");
                    String searchIsbn = sc.nextLine();
                    myLibrary.checkOutBook(searchIsbn);
                    break;
                }
                case "3":
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = sc.nextLine();
                    myLibrary.returnBook(returnIsbn);
                    break;
                
                case "4": {
                    System.out.print("Enter ISBN to search: ");
                    String searchIsbn = sc.nextLine();
                    myLibrary.findBook(searchIsbn);
                    break;
                }
                case "5":
                    myLibrary.showStats();
                    break;

                case "6":
                    running = false;
                    break;
            
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }
        sc.close();
    }
}
