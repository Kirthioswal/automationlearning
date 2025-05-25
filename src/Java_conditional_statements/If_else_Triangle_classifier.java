package Java_conditional_statements;

import java.util.Scanner;

public class If_else_Triangle_classifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter side 1 :");
        float s1 = s.nextFloat();
        System.out.println("Enter side 2 :");
        float s2 = s.nextFloat();
        System.out.println("Enter side3 :");
        float s3 = s.nextFloat();

        if(s1==s2 && s2==s3) {
            System.out.println("Its an Equilateral Triangle");
        }
        else if (s1==s2 || s2==s3 || s1==s3){
            System.out.println("Its an Isosceles Triangle");
        }
        else
            System.out.println("Its an Scalene Triangle");
    }
}
