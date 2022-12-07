package Looouiiis.stringtest;

public class StringTest {

    public static void main(String[] args) {
        String a = new String("abc");
        String b = "abc", c = "abc", d = new String("abc");
        if (a == b) {
            System.out.println(1);
        } else if (a.toString() == b.toString()) {
            System.out.println(2);
        } else if (a.equals(b)) {
            System.out.println(3);
        }
        if (b == c)
            System.out.println(7);
        if (!(a == d))
            System.out.println(10);
    }
}
