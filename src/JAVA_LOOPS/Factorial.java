package JAVA_LOOPS;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        int f=1;
        System.out.print(n+" ! =");
        for(int i=n;i>=1;i--){
            f=f*i;
            System.out.print(i);
            if(i!=1)
                System.out.print("*");
            else
                System.out.println("=" + f);
        }

    }
}
