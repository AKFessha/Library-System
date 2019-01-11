package com.company;

public class Cabinet {
    private String CabinetTitle, color;
    private int number, width, height;

    Shelf[] myShelves= new Shelf[2];

    //Getters and setters

    public String getCabinetTitle() {
        return CabinetTitle;
    }

    public void setCabinetTitle(String cabinetTitle) {
        CabinetTitle = cabinetTitle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Shelf[] getMyShelves() {
        return myShelves;
    }

    public void setMyShelves(Shelf[] myShelves) {
        this.myShelves = myShelves;
    }





}
