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



//Cabinet details
    public void CabinetDetails(int i){
        String title= "";
        do {
            System.out.println("Please enter the title of the Cabinet: ");
            title = Validator.validateString();
            setCabinetTitle(title);
            if(title== "" || title !=null){
                System.out.println("Please enter proper title: ");

            }
        }
         while (title.equals("") || title.equals(null));
        System.out.println("\nCabinet titled \"" + getCabinetTitle() + "\" was successfully added \n");
        setNumber(i + 1);
        System.out.println("Press Enter to Continue");
        Validator.validateString();
    }

}
