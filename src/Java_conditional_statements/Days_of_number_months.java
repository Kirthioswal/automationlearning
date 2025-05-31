package Java_conditional_statements;


import java.util.Scanner;

public class Days_of_number_months {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a month 1-12:");
        int month=1;
        int year = 1;
        if (s.hasNextInt()) {
             month = s.nextInt();

                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
                    case 4,6,9,11-> System.out.println("30 days");
                    case 2 -> {
                        System.out.println("Enter a year :");
                        if (s.hasNextInt()){
                            year =s.nextInt();
                        }
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                            System.out.println("29 days ");
                        } else
                            System.out.println("28 days");
                    }
                    default -> System.out.println("Invalid month");
                }
            } else
                System.out.println("Invalid input! Please enter a number.");
        }
    }


