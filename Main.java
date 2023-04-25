package com.satishac;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("SOUT key shortcut");

        //Comment Single-line comment
        /*
        This is a multi-line comment
         */

        //Reference Types / Objects
        Point p = new Point(10,10);
        Point p2 = new Point(20,20);
        System.out.println(p); //sout
        System.out.println("p = " + p); //soutv
        p.move(10, 11);
        System.out.println("p = " + p);
        System.out.println("p2 = " + p2);
    }
}