import java.util.Scanner;

public class Number_classifier {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        if(num<0){
            System.out.println("Its a negative number");
        }
        else if(num>0){
            System.out.println("Its a positive number");
        }
        else
            System.out.println("Its zero");
    }
}
