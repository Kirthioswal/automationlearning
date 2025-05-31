package JAVA_LOOPS;

import java.util.Scanner;

public class vowelscount
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string : ");
        String word= s.nextLine();
        char[] ch = word.toCharArray();
        int vowelcount=0;
        int constantcount=0;

        for(int h=0;h<ch.length;h++) {
            char c = Character.toLowerCase(ch[h]);
            if (Character.isLetter(c)) {
                switch (c) {
                    case 'a', 'e', 'i', 'o', 'u' -> vowelcount++;
                    default -> constantcount++;
                }

            }
        }
        System.out.println("Vowels =" +vowelcount);
        System.out.println("Constant="+constantcount);

    }
}
