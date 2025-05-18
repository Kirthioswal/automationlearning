package Java_operators;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in)  ;
        System.out.println("Enter a :");
        int a=s.nextInt();
        System.out.println("Enter b :");
        int b=s.nextInt();

        if(a%b==0){
            System.out.println("This is a even number");
        }
        else {
            System.out.println("This is a odd number");
        }

    }
}
