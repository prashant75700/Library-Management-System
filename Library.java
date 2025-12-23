import java.util.HashMap;

public class Library {
    //Non-static Hashmap: This specific library's collection
    private HashMap<String, Book > bookCollection = new HashMap<>();

    // Non-static method: Acts on a specific library's collection 
    public void addBook(String isbn, String title) {
        Book newBook = new Book(title);
        bookCollection.put(isbn, newBook);
        System.out.println("Added: " + title + " [ISBN: " + isbn + " ]");
    }

    public void findBook(String isbn) {
        if (bookCollection.containsKey(isbn)) {
            System.out.println("Found: " + bookCollection.get(isbn).title);
        }
        else {
            System.out.println("Book not found!");
        }
    }

    public void checkOutBook(String isbn) {
        if (bookCollection.containsKey(isbn)) {
            Book book = bookCollection.get(isbn); // it helps to retrieve the Object

            if (!book.isCheckedOut) {
                book.isCheckedOut = true;
                System.out.println("Success: You have checked out " + book.title);
            }
            else {
                System.out.println("Error: " + book.title + " is already Checked out!");
            }

        }
        else {
            System.out.println("Error: ISBN not found.");
        }
    }

    public void returnBook(String isbn) {
        if (bookCollection.containsKey(isbn)) {
            Book book = bookCollection.get(isbn);
            if (book.isCheckedOut) {
                book.isCheckedOut = false; // Reset the status
                System.out.println(">>> Error: This book was never checked Out!");
            }
            else {
            System.out.println(">>> Error: This book is not checked out!");
            }
        }
        else {
            System.out.println(">>> Error: ISBN not found in our System.");
        }
    }

    public void showStats() {
        System.out.println("\n--- Library Stats ---");
        //here Accessing the static variable via the Class name
        System.out.println("\nTotal Books Registered in System: " + Book.totalBooksCreated);
        System.out.println("Books in this specific inventory: " + bookCollection.size());
    }
}
