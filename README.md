# 📚 Library Management System (Java)
A clean, console-based application demonstrating core Java principles including Object-Oriented Programming (OOP), Data Structures, and Static vs. Non-Static logic.

## 🛠️ Features in This Version

* **Custom Book Objects:** Uses a `Book` class to store individual attributes like title and availability.
* **HashMap Inventory:** Implements a `HashMap<String, Book>` for high-performance searching using ISBN as the unique key.
* **Global Tracking:** Uses a `static` variable (`totalBooksCreated`) to track how many books have been added to the system globally.
* **Interactive Menu:** A robust `while` loop and `switch` statement that handles user input through a `Scanner`.
* **Transaction Logic:** Refined logic for adding, finding, checking out, and returning books with accurate status updates.

---

## 🏗️ Technical Logic Breakdown

### Static vs. Non-Static
* **Static (`totalBooksCreated`):** Belongs to the `Book` class itself. Every time a new `Book` is instantiated, this global counter increases.
* **Non-Static (`title`, `isCheckedOut`):** Unique to each specific book instance. Checking out "Java 101" does not affect the status of "Python Basics."

### HashMap Advantage
Instead of looping through an array to find a book, this system uses `bookCollection.get(isbn)`. This allows for **O(1) time complexity**, meaning the search speed stays the same whether you have 10 books or 10,000.

---

## 🚧 Upcoming Roadmap (Future Improvements)

While the current version provides a strong foundation, the following features are planned for future updates:

1.  **Data Persistence:** Adding **File I/O** (using `FileWriter` and `BufferedReader`) so that library data isn't lost when the program is closed.
2.  **Auto-Save Logic:** Triggering a save function after every "Add" or "Checkout" to ensure data integrity.
3.  **Search by Title:** Creating a method to iterate through the HashMap values to find books by title instead of just ISBN.
4.  **Borrower Logging:** A secondary HashMap to track *who* has borrowed which ISBN.

---

## 💻 How to Use
1. Copy the three classes (`Book`, `Library`, `Main`) into your Java IDE.
2. Run the `Main` class.
3. Use the numeric menu to manage your library directly from the console!

---

## 🤝 Contributing & Collaboration
**Collaborators are welcomed!** I am using this project to explore Java fundamentals. If you want to help implement the roadmap items, optimize the code, or suggest new features, feel free to fork this repository, open an issue, or submit a pull request. Let's build and learn together!

---

## 👤 Author
**Prashant** - [GitHub Profile](https://github.com/prashant75700)
