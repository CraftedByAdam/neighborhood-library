package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    private static Book[] books = new Book[20];

    private static int numOfBooks = 20;


    public static void main(String[] args) {
        books[0] = new Book(1, "111-1111111101", "Adam Becomes an Engineer - Hello World!");
        books[1] = new Book(2, "111-1111111102", "Adam Becomes an Engineer Chapter 2");
        books[2] = new Book(3, "111-1111111103", "Adam Becomes an Engineer Chapter 3");
        books[3] = new Book(4, "111-1111111104", "Adam Becomes an Engineer Chapter 4");
        books[4] = new Book(5, "111-1111111105", "Adam Becomes an Engineer - Stuck in a Loop!");
        books[5] = new Book(6, "111-1111111106", "Adam Becomes an Engineer Chapter 6");
        books[6] = new Book(7, "111-1111111107", "Adam Becomes an Engineer Chapter 7");
        books[7] = new Book(8, "111-1111111108", "Adam Becomes an Engineer Chapter 8");
        books[8] = new Book(9, "111-1111111109", "Adam Becomes an Engineer Chapter 9");
        books[9] = new Book(10, "111-11111111010", "Adam Becomes an Engineer - Fighting Bugs!");
        books[10] = new Book(11, "111-1111111011", "Adam Becomes an Engineer Chapter 11");
        books[11] = new Book(12, "111-1111111012", "Adam Becomes an Engineer Chapter 12");
        books[12] = new Book(13, "111-1111111013", "Adam Becomes an Engineer Chapter 13");
        books[13] = new Book(14, "111-1111111014", "Adam Becomes an Engineer Chapter 14");
        books[14] = new Book(15, "111-1111111015", "Adam Becomes an Engineer - Unknown Errors?");
        books[15] = new Book(16, "111-1111111016", "Adam Becomes an Engineer Chapter 16");
        books[16] = new Book(17, "111-1111111017", "Adam Becomes an Engineer Chapter 17");
        books[17] = new Book(18, "111-1111111018", "Adam Becomes an Engineer Chapter 18");
        books[18] = new Book(19, "111-1111111019", "Adam Becomes an Engineer Chapter 19");
        books[19] = new Book(20, "111-1111111020", "Adam Becomes an Engineer - The Last Line!");

        Scanner scanner = new Scanner(System.in);

        boolean isDone = false;

        while (!isDone) {

            System.out.println();
            System.out.println("Store Home Screen");
            System.out.println("------------------");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            System.out.println();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    listAllBooks(scanner);
                    break;
                case 2:
                    checkedOutBooks(scanner);
                    break;
                case 3:
                    isDone = true;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

    public static void listAllBooks(Scanner scanner) {
        System.out.println();
        System.out.println("Books Available");
        System.out.println("------------------");

        for (int i = 0; i < numOfBooks; i++) {
            if (!books[i].isCheckedOut()) {
                System.out.println(books[i]);
            }
        }

        System.out.println("------------------");

        System.out.print("Enter the Id of the book you want to check out (X to cancel): ");
        String bookId = scanner.next();

        if (bookId.equalsIgnoreCase("X")) {
            return;
        }

        System.out.print("Enter your name: ");
        String name = scanner.next();

        boolean checkOut = false;
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getBookId() == Integer.parseInt(bookId)) {
                books[i].checkOut(name);
                System.out.println("Thank you, " + name + "! " + "You checked out " + "\"" + books[i].getBookTitle() + "\".");
                checkOut = true;
            }
        }
    }
    public static void checkedOutBooks(Scanner scanner) {
        System.out.println();
        System.out.println("Checked out Books");
        System.out.println("------------------");


        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].isCheckedOut()) {
                System.out.println("Id: " + books[i].getBookId() + " ISBN: " + books[i].getBookIsbn() + " Title: " + books[i].getBookTitle() + " -> " + books[i].getCheckedOutTo());
                System.out.println("------------------");
            }
        }

        System.out.print("Press C to check in a book, or X to return: ");
        String checkInBook = scanner.next();

        if (checkInBook.equalsIgnoreCase("C")) {
            System.out.print("Enter the Id of the book you want to check in: ");
            String bookId = scanner.next();

            for(int i = 0; i < numOfBooks; i++){
                if (books[i].getBookId() == Integer.parseInt(bookId)){
                    books[i].checkIn();
                    System.out.println("Thank you for returning" + " \"" + books[i].getBookTitle() + "\".");
                }
            }
        }else if (checkInBook.equalsIgnoreCase("X")) {
            return;
        }
    }

}
