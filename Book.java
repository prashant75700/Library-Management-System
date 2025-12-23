public class Book {
    
    String title; // Non-Static: Each Book has it's own unique Title
    boolean isCheckedOut; // helps us to find out that this book is in the library or borrow by another person.

// Static means : This belongs to the class, not a specific book.
    public static int totalBooksCreated = 0;

    public Book(String title) {
        this.title = title;
        this.isCheckedOut = false;
        totalBooksCreated++; // it'll increment the global count, so we can know that how many books we have rn
    }
}
