package exp1;
class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    Book(int bookId, String title, String author, String category,
         double price, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Price: Rs " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("-------------------------");
    }
}

class Exp1 {
    public static void main(String[] args) {

        Book book1 = new Book(
            101,
            "Java Programming",
            "Herbert Schildt",
            "Programming",
            650.00,
            true
        );

        Book book2 = new Book(
            102,
            "Data Structures",
            "Seymour Lipschutz",
            "Computer Science",
            550.00,
            false
        );

        System.out.println("LIBRARY MANAGEMENT SYSTEM");

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}