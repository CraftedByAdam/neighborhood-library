package com.pluralsight;

public class Book {
    //Here are the properties I made
    private int bookId;
    private String bookIsbn;
    private String bookTitle;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //This is the Constructor
    public Book(int bookId, String bookIsbn, String bookTitle) {
        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.isCheckedOut = false;
        this.checkedOutTo = null;
    }

    //Here are all my Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {this.bookIsbn = bookIsbn;}

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //This is my checkOut method
    public void checkOut(String nameOfPerson) {
        checkedOutTo = nameOfPerson;
        isCheckedOut = true;
    }

    //This is my checkIn method
    public void checkIn() {
        checkedOutTo = null;
        isCheckedOut = false;
    }

    //Here is my Override method, it converts my Book object into a readable string
    @Override
    public String toString() {
        return "Id: " + bookId + " | " + "ISBN: " + bookIsbn+ " | " + "Tittle: " + bookTitle;
    }
}

