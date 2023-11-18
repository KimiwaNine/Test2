package chapter1;

public class ShiftOpt {
    public static void main(String[] args) {
        int value =4;
        int move =2;

        //<< , >>

        //4         0100   ** Right Shift **
        //4 << 2  010000   //value * 2^move  5* 2^3 = 5 * 8 =40
        System.out.println(value << move);

        System.out.println(5>> move);     // 5        0101  ** Left Shift **
                                          // 5>>2     ..01
                                          // value /2*move      12/2^3 = 12/8 =1
        System.out.println(5 << 3);
        System.out.println(12 >> 3);
    }
}
