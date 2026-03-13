import java.util.*;

class Book {
    int id;
    String title;
    String author;
    boolean isIssued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String toString() {
        return "ID: " + id +
                " | Title: " + title +
                " | Author: " + author +
                " | Status: " + (isIssued ? "Issued" : "Available");
    }
}

public class PROJECT_4_LIBRARY_MANAGEMENT {

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findBookById(id) != null) {
            System.out.println("Book ID already exists!");
            return;
        }

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    static void searchBook() {
        sc.nextLine();

        System.out.print("Enter Book ID, Title or Author to search: ");
        String input = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Book b : books) {

            if (input.matches("d+")) {
                int id = Integer.parseInt(input);
                if (b.id == id) {
                    System.out.println(b);
                    found = true;
                }
            }

            else if (b.title.toLowerCase().contains(input) || b.author.toLowerCase().contains(input)) {
                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int bookId = sc.nextInt();

        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (book.isIssued) {
            System.out.println("Book already issued!");
        } else {
            book.isIssued = true;
            System.out.println("Book issued successfully!");
        }
    }

    static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int bookId = sc.nextInt();

        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (!book.isIssued) {
            System.out.println("Book is not issued!");
        } else {
            book.isIssued = false;
            System.out.println("Book returned successfully!");
        }
    }

    static Book findBookById(int id) {
        for (Book b : books) {
            if (b.id == id)
                return b;
        }
        return null;
    }

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n----- LIBRARY MANAGEMENT SYSTEM -----");
            System.out.println("Enter 1 for Add Book");
            System.out.println("Enter 2 for View All Books");
            System.out.println("Enter 3 for Search Book");
            System.out.println("Enter 4 for Issue Book");
            System.out.println("Enter 5 for Return Book");
            System.out.println("Enter 6 for Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;

                case 3:
                    searchBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;

                case 6:
                    System.out.println("Exit the system");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 6);
    }
}