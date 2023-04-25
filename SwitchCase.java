package com.satishac;

public class SwitchCase {
    public static void main(String[] args) {
        //Old Switch
        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Good - Pass");
                break;
            default:
                System.out.println("Fail");
        }

        //New Switch
        String result = switch (grade) {
            case 'A' -> "Excellent";
            case 'B', 'C' -> "Good - Pass";
            default -> "Fail";
        };
        System.out.println(result.toUpperCase());
    }
}
