package com.company;

public class Shelf {
    private int number, length;
    private String shelfName;
    Book[] myBooks= new Book [2];

    //Getters and setters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }

    public Book[] getMyBooks() {
        return myBooks;
    }

    public void setMyBooks(Book[] myBooks) {
        this.myBooks = myBooks;
    }

    //Shelf details
    public void ShelfDetails(int i,int n, String cabinetTitle){

    }
}
