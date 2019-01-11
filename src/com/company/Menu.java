package com.company;

import java.lang.invoke.SwitchPoint;

public class Menu {
    Cabinet[] myCabinets = new Cabinet[2];
    public void displayMenu(){

        int choice=0;
        while(choice!=7){
            System.out.println("**************** Menu ******************");
            System.out.println("1. Add cabinets and specify cabinet detail");
            System.out.println("2. Add shelf and specify shelf details");
            System.out.println("3. Add Books and specify Book details");
            System.out.println("4. List available cabinets");
            System.out.println("5. List available shelves by Cabinet");
            System.out.println("6. List available Books by shelves and Cabinet");
            System.out.println("7. Exit");
            System.out.println( "Please chose an option from the menu: " );
            choice = Validator.validateInteger();
            ChoiceProcessing(choice);


        }
    }

    public void ChoiceProcessing(int choice) {
        if(choice==1){

            int numberOfCabinets= ListAllCabinets();
            //Loop through the array[] my cabinets to add a cabinet object if possible
            for(int i=0; i<myCabinets.length; i++){
                //Exit the loop if the last element is not null, entails that the array is full
                if (myCabinets[myCabinets.length-1] != null) {
                    System.out.println("You can not add any more cabinet, Press Enter to continue: ");
                    Validator.validateString();
                    break;
                }
                //This is when an element is encountered that is not null
                else if(myCabinets[i] == null){
                    myCabinets[i]= new Cabinet();
                    myCabinets[i].CabinetDetails(i); // Enter the properties of cabinet
                    break; // After insertion exit the loop, one cabinet inserted at a time
                }
            }
        }
        else if(choice==2){
            int cabinetNumber= 0;
            int numberOfAvailableCabinets= ListAllCabinets(); //to show what cabinets are available
            if(myCabinets[0]!=null)//This means we have at least one cabinet
            {
                //We need to catch exceptions if the user enters an invalid number
                //Two exceptions(NullPointException and ArrayIndexOutOfBound
                try {
                    System.out.println("Please specify which cabinet to add the shelf to: {1-" + numberOfAvailableCabinets);
                    cabinetNumber = Validator.validateInteger();

                    //Pass the cabinet number which the shelf to be added
                    myCabinets[cabinetNumber-1].AddShelf(cabinetNumber);
                }
                catch(NullPointerException e){
                    System.out.println("No cabinets with this number, press enter to return to the Menu");
                    Validator.validateString();
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("The largest cabinet number is  " + cabinetNumber + " press enter to return to the Menu");
                    Validator.validateString();
                }

            }

        }
        else if(choice==3){
            System.out.println("Choice 3 was selected");
        }
        else if(choice==4){
            System.out.println("Choice 4 was selected");
        }
        else if(choice==5){
            System.out.println("Choice 5 was selected");

        }
        else if(choice == 6){
            System.out.println("Choice 6 was selected");
        }

    }

    private int ListAllCabinets() {
        // used for the number of cabinets that has been instantiated
        int numberOfCabinets = 0;
        //Loop through the array[] myCabinets, to find out how many elements of cabinet have been added already
        for (int i=0; i< myCabinets.length; i++){
            if(myCabinets[i]!= null){
                numberOfCabinets++;
            }
            else{
                break;
            }
        }
        if(myCabinets[0]== null){
            System.out.println("This library has no cabinets yet.., Please press enter to continue");
        }
        else{
            System.out.println("\nThere is/are "+ numberOfCabinets + " Cabinet(s)");
            for(int i=0; i<numberOfCabinets; i++){
                myCabinets[i].DisplayCabinetDetails(i);
            }
        }
        return numberOfCabinets;
    }

    private void ListAllShelves(){
        if(myCabinets[0]==null){
            System.out.println("There are no cabinets yet!");
            Validator.validateString();
        }
        else{
            //Loop through the array[] myCabinets, to find out how many elements of cabinet have been added already
            for(int i=0; i<myCabinets.length; i++) {
                if (myCabinets[i] == null) {
                    break;

                }

            }
        }
    }
}
