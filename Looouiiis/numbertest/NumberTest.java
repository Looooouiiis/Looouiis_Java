package Looouiiis.numbertest;

public class NumberTest {
    static Integer x = new Integer(3);
    static Integer y = 3;

    public static void main(String[] args) {
        if (x.intValue() == y.intValue()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
