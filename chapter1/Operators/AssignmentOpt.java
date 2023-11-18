package chapter1.Operators;

public class AssignmentOpt {
    public static void main(String[] args) {
        //=, +=, -=, *=, %=

        int a= 3;
        int b= 5;

        a += 4;
        // a = a(3) + 4

        b += a;

        System.out.println(a);
        System.out.println(b);

        a %= b;
        System.out.println(a);

        boolean res = 3 + 4 <= 3 + 6 && 3 < 4;
        System.out.println(res);
        // 7 <= 9 && 3 < 4 // < > <= >= ==
        //   true && false
        //   true
        // Assignment
    }
}
