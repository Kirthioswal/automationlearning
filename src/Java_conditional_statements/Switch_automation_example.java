package Java_conditional_statements;

import java.util.Scanner;

public class Switch_automation_example {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a browser you want to use : ");
        String browser=s.next();
        browser=browser.toLowerCase();
        switch (browser){
            case "chrome" -> {
                System.out.println("Starting a chrome browser : " );
                System.out.println("....... " );
                System.out.println("TC01 " );
                System.out.println("TC02 " );
                System.out.println("TC03 " );
            }
            case "edge" -> {
                System.out.println("Starting a Edge browser : " );
                System.out.println("....... " );
                System.out.println("TC01 " );
                System.out.println("TC02 " );
                System.out.println("TC03 " );
            }
            case "firefox"->{
                System.out.println("Starting a Firefox browser : " );
                System.out.println("....... " );
                System.out.println("TC01 " );
                System.out.println("TC02 " );
                System.out.println("TC03 " );
            }
            default ->
                System.out.println("Invalid browser , Please enter a Valid browser : " );


            }
        }
    }

