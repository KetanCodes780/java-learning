
public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
        // Precedence & Associativity
        //precedence means-priority and
        // when both op same precedence that associativity takes place 

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        // Quick Quiz
        // int x =6;
        // int y = 1;
        //  int k = x * y/2;

        int b = 0;
        int c = 0;
        int a = 10;
        int k = (b*b - (4*a*c))/(2*a);
        System.out.println(k);

        // Java does not have a ^ operator for powers. For powers, you must use Math.pow()

        int v=5;
        int u=4;
        int result=(int)Math.pow(v, 2) - (int)Math.pow(u, 2);
        // OR int result = (v * v) - (u * u);
        System.out.println(result);

    }
}