package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Library management: ");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book by index");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Enter book title: ");
                String title = input.nextLine();
                System.out.println("Enter book author: ");
                String author = input.nextLine();
                System.out.println("Enter book ID: ");
                int id = input.nextInt();
                input.nextLine();
                books.add(new Book(title, author, id));
                System.out.println("Book added.");
            } else if (choice == 2) {
                System.out.println("Enter the index of the book to remove: ");
                int index = input.nextInt();
                if (index >= 0 && index < books.size()) {
                    books.remove(index);
                    System.out.println("Book removed.");
                } else {
                    System.out.println("Invalid index.");
                }
            } else if (choice == 3) {
                System.out.println("Books in the library: ");
                for (Book book : books) {
                    System.out.println(book);
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice.");
            }
        }
        input.close();
    }
}
