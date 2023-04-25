package com.satishac;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] num = new int[3];
        System.out.println(Arrays.toString(num));
        Arrays.fill(num, -1);
        num[2] = 27;
        System.out.println(Arrays.toString(num));

        String[] names = new String[3];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names, "SSS");
        names[2] = "Satish";
        System.out.println(Arrays.toString(names));

        String[] fornames = {
                "Satish",
                "Sanjana",
                "Jiya",
                "Sneha"
        };

        //for loop
        for(int i=0; i < fornames.length; i++){
            System.out.println(fornames[i]);
        }

        //Enhanced for loop
        for(String name : fornames){
            System.out.println(name);
        }
    }
}
