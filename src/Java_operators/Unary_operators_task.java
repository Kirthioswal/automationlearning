package Java_operators;

public class Unary_operators_task {
    public static void main(String[] args) {
        int a= +1;  //here + is a unary operator which is used with only 1 operand and ignored by jvm
        System.out.println(a);

        int a1=-110; //here - is a unary operator which is used with only 1 operand and ignored by jvm
        int res =a+a1;
        System.out.println(res);

        int b=-1;
        b= b+1;
        System.out.println(b);
    }
}
