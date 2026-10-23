import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array containing 20 books
        Book[] inventory = {
                new Book(1, "978-0141439518", "Pride and Prejudice"),
                new Book(2, "978-0061120084", "To Kill a Mockingbird"),
                new Book(3, "978-0743273565", "The Great Gatsby"),
                new Book(4, "978-0451524935", "1984"),
                new Book(5, "978-0062315007", "The Alchemist"),
                new Book(6, "978-0140449136", "The Odyssey"),
                new Book(7, "978-0316769488", "The Catcher in the Rye"),
                new Book(8, "978-0140283334", "Animal Farm"),
                new Book(9, "978-0307474278", "The Girl with the Dragon Tattoo"),
                new Book(10, "978-0439023481", "The Hunger Games"),
                new Book(11, "978-0547928227", "The Hobbit"),
                new Book(12, "978-0261103573", "The Fellowship of the Ring"),
                new Book(13, "978-1451673319", "Fahrenheit 451"),
                new Book(14, "978-0141439600", "Jane Eyre"),
                new Book(15, "978-1501173219", "The Outsider"),
                new Book(16, "978-0307743657", "The Shining"),
                new Book(17, "978-0060850524", "Brave New World"),
                new Book(18, "978-0140449266", "Crime and Punishment"),
                new Book(19, "978-0142437179", "Moby-Dick"),
                new Book(20, "978-0141441146", "A Tale of Two Cities")
        };

        // Home screen should display a list of options that a user can choose from.
        Scanner read = new Scanner(System.in);
        char command; // user menu choice
        do {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - Show Available Books");
            System.out.println(" 2 - Show Checked Out Books");
            System.out.println(" 3 - Exit");
            System.out.print("Enter your command: ");

            command = read.next().charAt(0);
            read.nextLine();

            switch (command) {
                case '1' -> showAvailableBooks(inventory, read);
                case '2' -> showCheckedOutBooks();
                default -> command = '3';
            }
        } while (command != '3');

        read.close();
    }

    // Displays a list of all books that are not currently checked
    // Displays the Id, ISBN and Title of the book.
    static void showAvailableBooks(Book[] inventory, Scanner read) {
        for (Book book : inventory) {
            if (!book.isCheckedOut()) {
                System.out.println(book);
            }
        }
        // Prompt the user to either select a book to check out, or exit to go back to
        // the home screen
        char command;
        do {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - Select a book to check out");
            System.out.println(" 2 - Exit");
            System.out.print("Enter your command: ");

            command = read.next().charAt(0);
            read.nextLine();

            // If the user wants to check out a book, prompt them for their name
            // Then check out the book
            if (command == '1') {
                System.out.print("Enter your name: ");
                String name = read.nextLine().trim();
                System.out.print("Enter book ID: ");
                int id = Integer.parseInt(read.nextLine().trim());

                boolean found = false;

                for (Book book : inventory) {
                    if (book.getId() == id) {
                        book.checkOut(name);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book ID not found.");
                }
            }
            else {
                command = '2';
            }
        } while (command != '2');
    }

    static void showCheckedOutBooks() {}
}
