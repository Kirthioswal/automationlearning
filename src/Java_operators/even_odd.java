package Java_operators;

import java.util.Scanner;

public class even_odd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = s.nextInt();


        String result = (a % 2 == 0) ? "Even" : "Odd"; //Ternary operator
        System.out.println(result);
    }
}




