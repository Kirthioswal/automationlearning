package Java_operators;

public class Logical_operators_task
{
    public static void main(String[] args) {
        boolean b= true;
        boolean c= false;
        System.out.println(b || c); // OR operator
        System.out.println(b && c); // AND operator
        System.out.println(!c); //NOT operator

        int a=10;
        int s= 20;
        int r=30;
         if((a>s) && (a>r))
             System.out.println( "a is greater");
          else if ((s>a)&& (s>r))
                 System.out.println( "s is greater");
          else
              System.out.println( "r is greater");

         }


}
