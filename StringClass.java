package com.satishac;

public class StringClass {
    public static void main(String[] args) {
        String firstName = "Satish ";
        String lastName = "Chandan";
        System.out.println(firstName + lastName);

        //String Class have many methods
        String result = firstName + lastName;
        System.out.println(result.toLowerCase());
        System.out.println(result.toUpperCase());
        System.out.println(result.substring(0, 4));
    }
}
