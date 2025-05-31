package JAVA_LOOPS;

import java.util.Scanner;

public class reverse_number {
    //reversing an integer with for loop
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number:");

        long rev=0;
        if(s.hasNextLong()){
            long n = s.nextLong();
            for(;n!=0;n=n/10){
                long rem= n %10;
                rev=rev*10+rem;
            }
            System.out.println(rev);
        }
    }
}
