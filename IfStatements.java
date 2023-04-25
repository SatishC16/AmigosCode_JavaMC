package com.satishac;

public class IfStatements {
    public static void main(String[] args) {
        if(true){
            System.out.println("This code runs when true");
        }
        else{
            System.out.println("This code runs when false");
        }
        System.out.println("This code is outside if-else");

        //with conditions
        // AND && OR || NOT ! operators
        int age = 4;
        boolean isAdult = age >= 18;
        if (isAdult) {
            System.out.println("Is an adult :)");
        } else if (age>0 && age <=5) {
            System.out.println("Is a baby :)");
        } else {
            System.out.println("Is not an adult :(");
        }

        //NOT ! operators
        if (!isAdult){
            System.out.println("Is not an adult :(");
        }
    }
}
