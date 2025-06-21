package Java_conditional_statements;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=s.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("its a leap year");
        } else
            System.out.println("its not a leap year");

    }
}