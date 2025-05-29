package Java_conditional_statements;

import java.util.Scanner;

public class Grade_classifier {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Grade:");
        char ch=s.next().charAt(0);
        ch = Character.toLowerCase(ch);
        switch (ch){
            case 'a' -> System.out.println(ch +" is Excellent ");
            case 'b' -> System.out.println(ch+ " is Very Good ");
            case 'c' -> System.out.println(ch+ " is Good ");
            case 'd' -> System.out.println(ch+ " Needs Improvement ");
            case 'f' -> System.out.println(ch+ "is  Fail ");
            default -> System.out.println(ch+ "is Invalid Grade ");
        }
    }
}
