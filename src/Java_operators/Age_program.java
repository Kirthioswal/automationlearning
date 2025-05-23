package Java_operators;

import java.util.Scanner;

public class Age_program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an age :");
        int age = s.nextInt();

        String result = age >=18 ? (age > 65 ? "Senior" : "Adult") : "Minor";
        System.out.println(result);
    }
}
