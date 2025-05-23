package Java_operators;

import java.util.Scanner;

public class Max_of_three {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int n1= s.nextInt();
        System.out.println("Enter 2nd number :");
        int n2 =s.nextInt();
        System.out.println("Enter 3rd number :");
        int n3=s.nextInt();

        String max=(n1>n2 && n1>n3 ) ? +n1 +" is max": ((n2>n1 && n2>n3 )? +n2 +" is max" : +n3+" is max" );
        System.out.println(max);
    }
}
