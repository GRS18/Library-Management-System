package operations;

import java.util.Scanner;

import Entity.Book;
import Entity.Member;
import service.Library;
import service.Transaction;

public class LibraryMain {

	public static void main(String[] args) {
		Library library = new Library();
		
        Transaction transaction = new Transaction();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Members");
            System.out.println("7. Display All Transactions");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book category: ");
                    String category = scanner.nextLine();
                    library.addBook(new Book(title, author, category,true));
                    break;

                case 2:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    library.addMember(new Member(name, memberId));
                    break;

                case 3:
                    System.out.print("Enter member ID: ");
                    String borrowMemberId = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String borrowBookTitle = scanner.nextLine();
                    library.borrowBook(borrowMemberId, borrowBookTitle);
                    transaction.recordBorrowTransaction(borrowMemberId, borrowBookTitle);
                    System.out.println("Book Borrowed successfully");
                    break;

                case 4:
                    System.out.print("Enter member ID: ");
                    String returnMemberId = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String returnBookTitle = scanner.nextLine();
                    library.returnBook(returnMemberId, returnBookTitle);
                    transaction.recordreturnTransaction(returnMemberId, returnBookTitle);
                    System.out.println("Book Returned successfully");
                    break;

                case 5:
                    library.displayAllBooks();
                    break;

                case 6:
                    library.displayAllMembers();
                    break;

                case 7:
                    transaction.displayTransactions();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

            }
        }
    }
		
		

	}


