package ex_01_java_literals;

public class Table_of_five {
    public static void main(String[] args){
        int n=5;
        int[] seq={1,2,3,4,5,6,7,8,9,10};
        int[] result = {
                 n*seq[0],
                 n*seq[1],
                 n*seq[2],
                 n*seq[3],
                 n*seq[4],
                 n*seq[5],
                 n*seq[6],
                 n*seq[7],
                 n*seq[8],
                 n*seq[9]
        };
        System.out.printf("%d * %d = %d\n",n ,seq[0],  result[0]);
        System.out.printf("%d * %d = %d\n",n ,seq[1], result[1]);
        System.out.printf("%d * %d = %d\n",n ,seq[2], result[2]);
        System.out.printf("%d * %d = %d\n",n ,seq[3], result[3]);
        System.out.printf("%d * %d = %d\n",n ,seq[4], result[4]);
        System.out.printf("%d * %d = %d\n",n ,seq[5], result[5]);
        System.out.printf("%d * %d = %d\n",n ,seq[6], result[6]);
        System.out.printf("%d * %d = %d\n",n ,seq[7], result[7]);
        System.out.printf("%d * %d = %d\n",n ,seq[8], result[8]);
        System.out.printf("%d * %d = %d\n",n ,seq[9], result[9]);

     /* System.out.println(+n+"*"+seq[1]+"="+result[1]);
        System.out.println(+n+"*"+seq[2]+"="+result[2]);
        System.out.println(+n+"*"+seq[3]+"="+result[3]);
        System.out.println(+n+"*"+seq[4]+"="+result[4]);
        System.out.println(+n+"*"+seq[5]+"="+result[5]);
        System.out.println(+n+"*"+seq[6]+"="+result[6]);
        System.out.println(+n+"*"+seq[7]+"="+result[7]);
        System.out.println(+n+"*"+seq[8]+"="+result[8]);
        System.out.println(+n+"*"+seq[9]+"="+result[9]);  */
    }
}
