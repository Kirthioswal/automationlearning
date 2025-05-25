package Java_conditional_statements;

import java.util.Scanner;

public class Switch_statement_day_identifier {
    public static void main(String[] args) {
        // Taking input from user and telling them which day it is
        Scanner s = new Scanner (System.in);
        System.out.println(("Enter a number between 1-7 : "));
        if(s.hasNextInt()) {
            int day = s.nextInt();
            // switch block

        switch(day){
            case 1 :
                System.out.println(+day +" is Monday");
                break;
            case 2 :
                System.out.println(+day +" is Tuesday");
                break;
            case 3 :
                System.out.println(+day +" is Wednesday");
                break;
            case 4 :
                System.out.println(+day +" is Thursday");
                break;
            case 5 :
                System.out.println(+day +" is Friday");
                break;
            case 6 :
                System.out.println(+day +" is Saturday");
                break;
            case 7 :
                System.out.println(+day +" is Sunday");
                break;
            default :
                System.out.println(+day +" is invalid ");
                break;
        }
        } else
            System.out.println("Invalid input: Please enter a number between 1 and 7.");

    }
}
