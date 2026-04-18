package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    private static Book[] books = new Book[20];

    private static int numOfBooks = 20;


    public  static void main(String[] args) {
        books[0] = new Book(1, "978-0590846288", "Adam Becomes an Engineer - Hello World");
        books[1] = new Book(2, "978-0590846288", "Adam Becomes an Engineer Chapter 2");
        books[2] = new Book(3, "978-0590846288", "Adam Becomes an Engineer Chapter 3");
        books[3] = new Book(4, "978-0590846288", "Adam Becomes an Engineer Chapter 4");
        books[4] = new Book(5, "978-0590846288", "Adam Becomes an Engineer - Stuck in a Loop");
        books[5] = new Book(6, "978-0590846288", "Adam Becomes an Engineer Chapter 6");
        books[6] = new Book(7, "978-0590846288", "Adam Becomes an Engineer Chapter 7");
        books[7] = new Book(8, "978-0590846288", "Adam Becomes an Engineer Chapter 8");
        books[8] = new Book(9, "978-0590846288", "Adam Becomes an Engineer Chapter 9");
        books[9] = new Book(10, "978-0590846288", "Adam Becomes an Engineer - Fighting Bugs");
        books[10] = new Book(11, "978-0590846288", "Adam Becomes an Engineer Chapter 11");
        books[11] = new Book(12, "978-0590846288", "Adam Becomes an Engineer Chapter 12");
        books[12] = new Book(13, "978-0590846288", "Adam Becomes an Engineer Chapter 13");
        books[13] = new Book(14, "978-0590846288", "Adam Becomes an Engineer Chapter 14");
        books[14] = new Book(15, "978-0590846288", "Adam Becomes an Engineer - Unknown Errors");
        books[15] = new Book(16, "978-0590846288", "Adam Becomes an Engineer Chapter 16");
        books[16] = new Book(17, "978-0590846288", "Adam Becomes an Engineer Chapter 17");
        books[17] = new Book(18, "978-0590846288", "Adam Becomes an Engineer Chapter 18");
        books[18] = new Book(19, "978-0590846288", "Adam Becomes an Engineer Chapter 19");
        books[19] = new Book(20, "978-0590846288", "Adam Becomes an Engineer - The Last Line");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Store Home Screen");
        System.out.println("------------------");
        System.out.println("1. Show Available Books");
        System.out.println("2. Show checked Out Books");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        scanner.nextLine();
    }
}
